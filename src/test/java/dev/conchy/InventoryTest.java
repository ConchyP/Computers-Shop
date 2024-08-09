package dev.conchy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InventoryTest {

    private Inventory inventory;
    private Computer computer1;
    private Computer computer2;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
        computer1 = new Computer(1, "HP", 16, "Intel i7", "Windows", 1000.0);
        computer2 = new Computer(2, "Dell", 16, "Intel i7", "Windows", 1200.0);
    }

    @Test
    void testAddComputer() {
        inventory.addComputer(computer1);
        inventory.addComputer(computer2);

       
        assertThat(inventory.getComputers(), hasSize(2));
        assertThat(inventory.getComputers(), hasItems(computer1, computer2));
    }

    @Test
    void testRemoveComputerByBrand() {
        inventory.addComputer(computer1);
        inventory.addComputer(computer2);

        inventory.removeComputerByBrand("HP");

    
        assertThat(inventory.getComputers(), hasSize(1));
        assertThat(inventory.getComputers(), contains(computer2));
    }

    @Test
    void testRemoveComputerById() {
        inventory.addComputer(computer1);
        inventory.addComputer(computer2);

        inventory.removeComputerById(1);

        assertThat(inventory.getComputers(), hasSize(1));
        assertThat(inventory.getComputers(), contains(computer2));
    }

    @Test
    void testFindComputerByBrand() {
        inventory.addComputer(computer1);
        inventory.addComputer(computer2);

        Computer foundComputer = inventory.findComputerByBrand("Dell");
        assertThat(foundComputer, is(equalTo(computer2)));
    }

    @Test
    void testFindComputerByBrandNotFound() {
        inventory.addComputer(computer1);
        Computer foundComputer = inventory.findComputerByBrand("Dell");
        assertThat(foundComputer, is(nullValue()));
    }

    @Test
    void testListAllComputersWhenEmpty() {
        inventory.listAllComputers();
    }

    @Test
    void testListAllComputersWithContent() {
        inventory.addComputer(computer1);
        inventory.addComputer(computer2);
        inventory.listAllComputers();
    }
}
