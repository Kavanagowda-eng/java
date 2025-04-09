package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Bag;

public class SchoolBag extends Bag {
    public SchoolBag() {
        super();
        System.out.println("SchoolBag is a subclass");
    }

    @Override
    public void storeItems() {
        super.storeItems();
    }

    @Override
    public void carryBag() {
        super.carryBag();
    }

    @Override
    public void openBag() {
        super.openBag();
    }

    @Override
    public void zipBag() {
        super.zipBag();
    }

    @Override
    public void checkCapacity() {
        super.checkCapacity();
    }

    public void color() {
        System.out.println("color of the Bag");

    }
}

