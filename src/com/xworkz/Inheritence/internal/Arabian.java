package com.xworkz.Inheritence.internal;
import com.xworkz.Inheritence.External.Sea;

public class Arabian extends Sea {
    public Arabian() {
        super();
        System.out.println("No args const in Arabian");
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void tree() {
        super.tree();
    }

    @Override
    public void weather() {
        super.weather();
    }

    @Override
    public void type() {
        super.type();
    }

    public void color() {
        System.out.println("color Of the sea");
    }
}


