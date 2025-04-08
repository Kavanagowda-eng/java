package com.xworkz.Inheritence.internal;
import com.xworkz.Inheritence.External.Panipuri;
public class Chaat extends Panipuri{
    public Chaat ()
    {
        super();
        System.out.println("No args const in Chaat");
    }

    @Override
    public void color() {
        super.color();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void flavor() {
        super.flavor();
    }

    @Override
    public void taste() {
        super.taste();
    }
    public void size() {
        System.out.println("size of the puri");
    }
}
