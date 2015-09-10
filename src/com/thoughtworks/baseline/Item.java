/*An item has a name and cost and checks if it is imported or has sales tax*/
package com.thoughtworks.baseline;

public class Item {

    private String name;
    private double shelfPrice;

    public Item(String name, double shelfPrice) {
        this.name = name;
        this.shelfPrice = shelfPrice;
    }

    public boolean isExemptedFromSalesTax() {
        if(name.equals("book") || name.equals("chocolate bar"))
            return true;
        else
            return false;
    }
}
