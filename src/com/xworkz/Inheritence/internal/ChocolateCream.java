package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Cream;

public class ChocolateCream extends Cream {

    public ChocolateCream() {
        super();
        System.out.println("ChocolateCream is a subclass");
    }

    @Override
    public void applyCream() {
        super.applyCream();
    }

    @Override
    public void soothingEffect() {
        super.soothingEffect();
    }

    @Override
    public void scent() {
        super.scent();
    }

    @Override
    public void provideMoisture() {
        super.provideMoisture();
    }

    @Override
    public void packaging() {
        super.packaging();
    }

    public void color() {
        System.out.println("color of the cream");
    }
}
