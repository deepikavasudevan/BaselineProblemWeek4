package com.thoughtworks.baseline;

public class Item {

    private String name;
    private double shelfPrice;

    public Item(String name, double shelfPrice) {
        this.name = name;
        this.shelfPrice = shelfPrice;
    }

    public boolean isExemptedFromSalesTax() {
        return true;
    }
}
