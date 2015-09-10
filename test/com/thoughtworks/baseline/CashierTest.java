package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CashierTest {

    @Test
    public void shouldCalculateSalesTaxOfShoppingBasket() {
        ArrayList<String> shoppingBasket = new ArrayList<>(Arrays.asList("1 book at 12.49", "1 music CD at 14.99", "1 chocolate bar at 0.85"));
        Cashier cashier = new Cashier(shoppingBasket);

        assertEquals(1.50, cashier.salesTaxOfShoppingBasket(), 0.001);
    }

    @Test
    public void shouldCalculateCostOfShoppingBasket() {
        ArrayList<String> shoppingBasket = new ArrayList<>(Arrays.asList("1 book at 12.49", "1 music CD at 14.99", "1 chocolate bar at 0.85"));
        Cashier cashier = new Cashier(shoppingBasket);

        assertEquals(29.83, cashier.costOfShoppingBasket(), 0.001);
    }
}
