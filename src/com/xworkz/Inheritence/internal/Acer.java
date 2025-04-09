package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Animal;
import com.xworkz.Inheritence.External.Laptop;

public class Acer extends Laptop {
    public Acer() {
        super();
        System.out.println("No args const in Acer");

    }

    @Override
    public void brand() {
        super.brand();
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void processor() {
        super.processor();
    }

    @Override
    public void storage() {
        super.storage();
    }

    @Override
    public void type() {
        super.type();
    }

    public void color() {
        System.out.println("color of the Laptop");
    }
}



