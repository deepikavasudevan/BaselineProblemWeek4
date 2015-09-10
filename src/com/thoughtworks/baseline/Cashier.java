/*A Cashier finds the total cost and sales tax of a shopping basket*/
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class Cashier {

    private ArrayList<String> shoppingBasket = new ArrayList<>();

    public Cashier(ArrayList<String> shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public double totalSalesTax() {
        double totalSalesTax = 0.0;

        for (String itemDetail : shoppingBasket) {
            Item item = convertItemDetailsIntoAnItem(itemDetail);
            totalSalesTax += item.salesTax() + item.importDuty();
        }
        return totalSalesTax;
    }

    private Item convertItemDetailsIntoAnItem(String itemDetail) {
        Parser parser = new Parser(itemDetail);
        return parser.parse();
    }

    public double totalCostOfShoppingBasket() {
        double totalCostOfShoppingBasket = 0.0;

        for (String itemDetail : shoppingBasket) {
            Item item = convertItemDetailsIntoAnItem(itemDetail);
            totalCostOfShoppingBasket += item.totalCost();
        }
        return totalCostOfShoppingBasket;
    }
}
