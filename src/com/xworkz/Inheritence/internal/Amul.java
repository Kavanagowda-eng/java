package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.IceCream;

public class Amul extends IceCream {
    public Amul() {
        super();
        System.out.println("No args const in Amul");
    }

    @Override
    public void eatScoop() {
        super.eatScoop();
    }

    @Override
    public void flavor() {
        super.flavor();
    }

    @Override
    public void priceOf() {
        super.priceOf();
    }

    @Override
    public void scoop() {
        super.scoop();
    }

    @Override
    public void select() {
        super.select();
    }

    public void color() {
        System.out.println("color of the Amul");
    }
}
