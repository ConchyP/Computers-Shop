package dev.conchy;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Computer> computers;

    public Inventory() {
        this.computers = new ArrayList<>();
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Computer added: " + computer);
    }

    public void removeComputerByBrand(String brand) {
        computers.removeIf(computer -> computer.getBrand().equalsIgnoreCase(brand));
        System.out.println("Computers with brand " + brand + " have been removed.");
    }

    public void removeComputerById(long id) {
        boolean removed = computers.removeIf(computer -> computer.getId() == id);
        if (removed) {
            System.out.println("Computer with ID " + id + " has been removed.");
        } else {
            System.out.println("No computer found with ID " + id);
        }
    }

    public Computer findComputerByBrand(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    public void listAllComputers() {
        if (computers.isEmpty()) {
            System.out.println("No computers available in the store.");
        } else {
            System.out.println("Listing all computers:");
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }

}
