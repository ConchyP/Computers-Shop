package dev.conchy;

public class ComputersShop {

    private String shopName;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public ComputersShop(String shopName, String owner, String taxId, List<Computer> computers) {
        this.shopName = shopName;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = computers;
    }


}
