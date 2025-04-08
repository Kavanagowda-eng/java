package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Books;

public class Camel extends Books {
    public Camel(){
        super();
        System.out.println("No args const in Camel");
    }

    @Override
    public void size() {
        super.size();
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void pages() {
        super.pages();
    }

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void print() {
        super.print();
    }
    public void clarity () {
        System.out.println("clarity of the camera");
    }

}