package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Fruits;

public class Banana extends Fruits {
    public Banana(){
        super();
        System.out.println("No args const in Banana");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void buy() {
        super.buy();
    }

    @Override
    public void sell() {
        super.sell();
    }

    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void distribute() {
        super.distribute();
    }
    public void color(){
        System.out.println("color of the fruit");
}
}