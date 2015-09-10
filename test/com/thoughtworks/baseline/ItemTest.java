package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
    public void shouldNotBeExemptedFromSalesTaxIfABottleOfPerfume() {
        Item item = new Item("bottle of perfume", 18.99);

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

    @Test
    public void shouldHaveSalesTaxIfItIsNotExemptedFromSalesTax() {
        Item item = new Item("bottle of perfume", 18.99);

        assertEquals(1.90, item.salesTax(), 0.001);
    }

    @Test
    public void shouldNotHaveSalesTaxIfExemptedFromSalesTax() {
        Item item = new Item("chocolate bar", 0.85);

        assertEquals(0.00, item.salesTax(), 0.001);
    }

    @Test
    public void shouldNotBeExemptedFromImportDutyIfItemIsImported() {
        Item item = new Item("imported box of chocolates", 10.00);

        assertFalse(item.isExemptedFromImportDuty());
    }

    @Test
    public void shouldBeExemptedFromImportDutyIfItemIsNotImported() {
        Item item = new Item("book", 12.49);

        assertTrue(item.isExemptedFromImportDuty());
    }

    @Test
    public void shouldHaveImportDutyIfNotExemptedFromIt() {
        Item item = new Item("imported box of chocolates", 10.00);

        assertEquals(0.50, item.importDuty(), 0.001);
    }

    @Test
    public void shouldNotHaveImportDutyIfItemIfExemptedFromIt() {
        Item item = new Item("book", 12.49);

        assertEquals(0.00, item.importDuty(), 0.001);
    }
}