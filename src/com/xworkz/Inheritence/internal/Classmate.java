package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Books;

public class Classmate extends Books {
    public Classmate() {
        System.out.println("No args const in Classmate");
    }

    @Override
    public void size() {
        super.size();
    }

    @Override
    public void pages() {
        super.pages();
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void type() {
        super.type();
    }

    public void color() {
        System.out.println("color of the Classmate");
    }
}
