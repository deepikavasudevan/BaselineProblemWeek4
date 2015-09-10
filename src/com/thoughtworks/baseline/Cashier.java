/*A Cashier finds the total cost and sales tax of a shopping basket*/
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class Cashier {

    private ArrayList<String> shoppingBasket = new ArrayList<>();

    public Cashier(ArrayList<String> shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public double salesTaxOfShoppingBasket() {
        double salesTaxOfShoppingBasket = 0.0;

        for (String itemDetail : shoppingBasket) {
            Item item = convertItemDetailsIntoAnItem(itemDetail);
            salesTaxOfShoppingBasket += item.salesTax() + item.importDuty();
        }
        return salesTaxOfShoppingBasket;
    }

    private Item convertItemDetailsIntoAnItem(String itemDetail) {
        Parser parser = new Parser(itemDetail);
        return parser.parse();
    }

    public double costOfShoppingBasket() {
        double costOfShoppingBasket = 0.0;

        for (String itemDetail : shoppingBasket) {
            Item item = convertItemDetailsIntoAnItem(itemDetail);
            costOfShoppingBasket += item.totalCost();
        }
        return costOfShoppingBasket;
    }
}
