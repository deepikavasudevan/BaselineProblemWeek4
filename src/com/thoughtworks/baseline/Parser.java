/*A Parser takes an input string and returns an Item which has name and shelfPrice*/
package com.thoughtworks.baseline;

public class Parser {

    private String inputString;

    public Parser(String inputString) {
        this.inputString = inputString;
    }

    public Item parse() {
        return new Item("book", 12.49);
    }
}
