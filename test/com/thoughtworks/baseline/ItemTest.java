package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ItemTest {

    @Test
    public void shouldBeExemptedFromSalesTaxIfItIsABook() {
        Item item = new Item("book", 12.49);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldNotBeExemptedFromSalesTaxIfItIsAMusicCd() {
        Item item = new Item("music CD", 14.99);

        assertFalse(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesIfItIsAChocolateBar() {
        Item item = new Item("chocolate bar", 0.85);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfItIsAnImportedBoxOfChocolates() {
        Item item = new Item("imported box of chocolates", 10.00);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldNotBeExemptedFromSalesTaxIfAnImportedBottleOfPerfume() {
        Item item = new Item("imported bottle of perfume", 47.50);

        assertFalse(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfPacketOfHeadachePills() {
        Item item = new Item("packet of headache pills", 9.75);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfBoxOfImportedChocolates() {
        Item item = new Item("box of imported chocolates", 11.25);

        assertTrue(item.isExemptedFromSalesTax());
    }
}
