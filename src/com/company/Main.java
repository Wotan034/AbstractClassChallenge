package com.company;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        GroceryList list = new GroceryList(null); // initialize grocery list
        list.traverse(list.getRoot()); //traverse method called to check empty list case

        String stringData = "Milk Cheese Eggs Butter Bread Pasta Eggs Honey"; //quick insert of non-alphabetical items into list with 2 eggs added to check existing item case

        String[] data = stringData.split(" "); // iterating over string with a for-each loop adding each separate word to grocery list as a new grocery
        for (String s : data) {
            list.addGrocery(new Grocery(s));
        }

        list.traverse(list.getRoot()); // prints list to see if items were added in alphabetical order.
    }
}
