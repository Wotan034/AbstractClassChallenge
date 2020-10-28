package com.company;

public class Grocery extends Jnode {

    public Grocery(String value) {
        super(value);
    }

    @Override
    Jnode next() {
        return this.right;
    }

    @Override
    Jnode setNext(Jnode item) {
        this.right = item;
        return this.right;
    }

    @Override
    Jnode previous() {
        return this.left;
    }

    @Override
    Jnode setPrevious(Jnode item) {
        this.left = item;
        return this.left;
    }

    @Override
    int compareTo(Jnode item) { //this compare method will compare lexicographically returning -1, 0, 1.
        if(item != null) {
            return (super.getValue().compareTo(item.getValue()));
        } else {
            return -1;
        }
    }
}
