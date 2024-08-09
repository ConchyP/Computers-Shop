package dev.conchy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ComputerTest {

    @Test
    void testGetBrand() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        assertThat(computer.getBrand(), is("Dell"));
    }

    @Test
    void testGetId() {
        
        Computer computer1 = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        Computer computer2 = new Computer(0, "HP", 32, "AMD Ryzen 5", "Linux", 1200.0);
        assertThat(computer1.getId(), not(equalTo(computer2.getId())));
    }
    
    @Test
    void testGetMemory() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        assertThat(computer.getMemory(), is(16));
    }

    @Test
    void testGetOperatingSystem() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        assertThat(computer.getOperatingSystem(), is("Windows"));
    }

    @Test
    void testGetPrice() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        assertThat(computer.getPrice(), is(closeTo(1000.0, 0.01)));
    }

    @Test
    void testGetProcessor() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        assertThat(computer.getProcessor(), is("Intel i7"));
    }

    @Test
    void testSetBrand() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        computer.setBrand("HP");
        assertThat(computer.getBrand(), is("HP"));
    }

    @Test
    void testSetId() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
    }

    @Test
    void testSetMemory() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        computer.setMemory(32);
        assertThat(computer.getMemory(), is(32));
    }

    @Test
    void testSetOperatingSystem() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        computer.setOperatingSystem("Linux");
        assertThat(computer.getOperatingSystem(), is("Linux"));
    }

    @Test
    void testSetPrice() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        computer.setPrice(1200.0);
        assertThat(computer.getPrice(), is(closeTo(1200.0, 0.01)));
    }

    @Test
    void testSetProcessor() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        computer.setProcessor("AMD Ryzen 5");
        assertThat(computer.getProcessor(), is("AMD Ryzen 5"));
    }

    @Test
    void testToString() {
        Computer computer = new Computer(0, "Dell", 16, "Intel i7", "Windows", 1000.0);
        long id = computer.getId();
        String expectedString = "Computer [id=" + id + ", brand=Dell, memory=16, processor=Intel i7, operatingSystem=Windows, price=1000.0]";
        assertThat(computer.toString(), is(expectedString));
    }
}

