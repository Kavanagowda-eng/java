package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Furniture;

public class Chair extends Furniture {
    public Chair(){
        super();
        System.out.println("no-argu const is running");
    }

    @Override
    public void design() {
        super.design();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void showcase() {
        super.showcase();
    }

    @Override
    public void sit() {
        super.sit();
    }

    @Override
    public void tostore() {
        super.tostore();
    }
    public void color() {
        System.out.println("color of the FURNITURE");
    }
}
