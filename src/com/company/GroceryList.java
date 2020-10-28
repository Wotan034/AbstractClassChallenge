package com.company;

public class GroceryList implements IGroceryList { // implements grocery list interface

    private Jnode root = null; // start of list

    public GroceryList(Jnode root) {
        this.root = root;
    }

    @Override
    public Jnode getRoot() {
        return this.root;
    }

    @Override
    public boolean addGrocery(Jnode newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        Jnode currentItem = this.root;
        while (currentItem != null) { // will insert alphabetically using the compare to method of a grocery
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added."); //if the item already exists.
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeGrocery(Jnode item) { // need to do
        return false;
    }

    @Override
    public void traverse(Jnode root) { //prints the list
        if (root == null) {
            System.out.println("This list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
