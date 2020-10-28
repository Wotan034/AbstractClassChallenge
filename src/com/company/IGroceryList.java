package com.company;

public interface IGroceryList { //interface for the grocery list methods.
    Jnode getRoot();
    boolean addGrocery(Jnode newItem);
    boolean removeGrocery(Jnode item);
    void traverse(Jnode root);
}
