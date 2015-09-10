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
        if (name.equals("book") || name.contains("chocolate") || name.equals("packet of headache pills"))
            return true;
        else
            return false;
    }

    public double salesTax() {
        if (!isExemptedFromSalesTax())
            return Math.ceil((0.10 * shelfPrice) * 20.0) / 20.0;
        else
            return 0.00;
    }

    public boolean isExemptedFromImportDuty() {
        return false;
    }
}
