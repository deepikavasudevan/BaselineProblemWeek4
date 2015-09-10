package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void shouldTakeAnInputStringAndReturnAnItem() {
        Parser parser = new Parser("1 book at 12.49");

        assertTrue(parser.parse() instanceof Item);
    }
}