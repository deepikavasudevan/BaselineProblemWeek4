/*A Parser takes an input string and returns an Item which has name and shelfPrice*/
package com.thoughtworks.baseline;

public class Parser {

    private String inputString;

    public Parser(String inputString) {
        this.inputString = inputString;
    }

    public Item parse() {
        String[] tokens = inputString.split(" ");
        String itemName = "";
        for (int i = 1; i < tokens.length - 3; i++) {
            itemName += tokens[i] + " ";
        }
        itemName += tokens[tokens.length - 3];

        return new Item(itemName, Double.parseDouble(tokens[tokens.length - 1]));
    }
}