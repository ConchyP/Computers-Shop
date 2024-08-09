package dev.conchy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

public class ComputersShopTest {

    @Test
    void testGetShopName() {
        ComputersShop shop = new ComputersShop("Tech Haven", "Alice", "123456789", new ArrayList<>());
        assertThat(shop.getShopName(), is("Tech Haven"));
    }

    @Test
    void testSetShopName() {
        ComputersShop shop = new ComputersShop("Tech Haven", "Alice", "123456789", new ArrayList<>());
        shop.setShopName("Gadget World");
        assertThat(shop.getShopName(), is("Gadget World"));
    }

    @Test
    void testGetOwner() {
        ComputersShop shop = new ComputersShop("Tech Haven", "Alice", "123456789", new ArrayList<>());
        assertThat(shop.getOwner(), is("Alice"));
    }

    @Test
    void testSetOwner() {
        ComputersShop shop = new ComputersShop("Tech Haven", "Alice", "123456789", new ArrayList<>());
        shop.setOwner("Bob");
        assertThat(shop.getOwner(), is("Bob"));
    }

    @Test
    void testGetTaxId() {
        ComputersShop shop = new ComputersShop("Tech Haven", "Alice", "123456789", new ArrayList<>());
        assertThat(shop.getTaxId(), is("123456789"));
    }

    @Test
    void testSetTaxId() {
        ComputersShop shop = new ComputersShop("Tech Haven", "Alice", "123456789", new ArrayList<>());
        shop.setTaxId("987654321");
        assertThat(shop.getTaxId(), is("987654321"));
    }

    @Test
    void testAddAndRetrieveComputers() {
        Computer computer1 = new Computer(0, "HP", 16, "Intel i7", "Windows", 1000.0);
        Computer computer2 = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1200.0);

        List<Computer> initialComputers = new ArrayList<>();
        initialComputers.add(computer1);
        initialComputers.add(computer2);

        ComputersShop shop = new ComputersShop("Tech Haven", "Alice", "123456789", initialComputers);

        
        assertThat(shop.getComputers(), hasSize(2));
        assertThat(shop.getComputers(), hasItems(computer1, computer2));

    }

    @Test
    void testSetComputers() {
        Computer computer1 = new Computer(0, "HP", 16, "Intel i7", "Windows", 1000.0);
        Computer computer2 = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1200.0);

        List<Computer> newComputers = new ArrayList<>();
        newComputers.add(computer1);
        newComputers.add(computer2);

        ComputersShop shop = new ComputersShop("Tech Haven", "Alice", "123456789", new ArrayList<>());
        shop.setComputers(newComputers);

        assertThat(shop.getComputers(), hasSize(2));
        assertThat(shop.getComputers(), contains(computer1, computer2));
    }
}
