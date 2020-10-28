package com.company;


public abstract class Jnode {  //Generic node class with attributes pointing to left(previous) node and same for right pointer. Called Jnode to avoid import errors.
    private String value;
    protected Jnode right;
    protected Jnode left;

    public Jnode(String value) {
        this.value = value;
    }

    abstract Jnode next(); // abstract methods to be implemented by Grocery class.
    abstract Jnode setNext(Jnode item);
    abstract Jnode previous();
    abstract Jnode setPrevious(Jnode item);

    abstract int compareTo(Jnode item); //we will want a compare to method to alphabetize new items that are added to the list

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
