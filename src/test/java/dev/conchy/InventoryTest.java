package dev.conchy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

public class InventoryTest {

    private Inventory inventory;
    private Computer computer1;
    private Computer computer2;
    private Computer computer3;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
        computer1 = new Computer(1, "HP", 16, "Intel i7", "Windows", 1000.0);
        computer2 = new Computer(2, "Dell", 16, "Intel i7", "Windows", 1200.0);
        computer3 = new Computer(3, "HP", 32, "AMD Ryzen 5", "Linux", 1500.0);
        inventory.addComputer(computer1);
        inventory.addComputer(computer2);
    }

    @Test
    void testAddComputer() {
        inventory.addComputer(computer3);
        assertThat(inventory.getComputers(), hasItem(computer3));
    }

    @Test
    void testRemoveComputerByBrand() {
        inventory.removeComputerByBrand("HP");
        assertThat(inventory.getComputers(), not(hasItem(computer1)));
        assertThat(inventory.getComputers(), not(hasItem(computer3)));
    }

    @Test
    void testRemoveComputerById() {
        inventory.removeComputerById(1);
        assertThat(inventory.getComputers(), not(hasItem(computer1)));
    }

    @Test
    void testFindComputerByBrand() {
        Computer foundComputer = inventory.findComputerByBrand("Dell");
        assertThat(foundComputer, is(computer2));
    }

    @Test
    void testFindComputerByBrandNotFound() {
        Computer foundComputer = inventory.findComputerByBrand("Apple");
        assertThat(foundComputer, is(nullValue()));
    }

    @Test
    void testListAllComputers() {
        inventory.addComputer(computer3);
        List<Computer> expectedComputers = List.of(computer1, computer2, computer3);
        assertThat(inventory.getComputers(), containsInAnyOrder(expectedComputers.toArray()));
    }
}
