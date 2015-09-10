package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ItemTest {

    @Test
    public void shouldBeExemptedFromSalesTaxIfItIsABook() {
        Item item = new Item("book", 12.49);

        assertTrue(item.isExemptedFromSalesTax());
    }
}
