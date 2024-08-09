package dev.conchy;


import java.util.ArrayList;
import java.util.List;

public class ComputersShop {

    private String shopName;
    private String owner;
    private String taxId;
    private List<Computer> computers;  

    public ComputersShop(String shopName, String owner, String taxId, List<Computer> computers) {
        this.shopName = shopName;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
}
