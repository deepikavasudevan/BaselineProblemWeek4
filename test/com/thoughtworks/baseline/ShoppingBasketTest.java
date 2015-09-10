package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void shouldCalculateItsTotalSalesTax() {
        ArrayList<String> itemDetails = new ArrayList<>(Arrays.asList("1 book at 12.49", "1 music CD at 14.99", "1 chocolate bar at 0.85"));
        ShoppingBasket shoppingBasket = new ShoppingBasket(itemDetails);

        assertEquals(1.50, shoppingBasket.salesTax(), 0.001);
    }

    @Test
    public void shouldCalculateItsTotalCost() {
        ArrayList<String> itemDetails = new ArrayList<>(Arrays.asList("1 book at 12.49", "1 music CD at 14.99", "1 chocolate bar at 0.85"));
        ShoppingBasket shoppingBasket = new ShoppingBasket(itemDetails);

        assertEquals(29.83, shoppingBasket.cost(), 0.001);
    }
}