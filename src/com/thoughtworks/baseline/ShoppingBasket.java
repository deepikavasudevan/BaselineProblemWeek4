/*A Shopping Basket finds the total cost and sales tax of its items*/
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<String> itemDetails = new ArrayList<>();

    public ShoppingBasket(ArrayList<String> itemDetails) {
        this.itemDetails = itemDetails;
    }

    public double salesTax() {
        double salesTax = 0.0;

        for (String itemDetail : itemDetails) {
            Item item = convertItemDetailsIntoAnItem(itemDetail);
            salesTax += item.salesTax() + item.importDuty();
        }
        return salesTax;
    }

    private Item convertItemDetailsIntoAnItem(String itemDetail) {
        Parser parser = new Parser(itemDetail);
        return parser.parse();
    }

    public double cost() {
        double cost = 0.0;

        for (String itemDetail : itemDetails) {
            Item item = convertItemDetailsIntoAnItem(itemDetail);
            cost += item.totalCost();
        }
        return cost;
    }
}