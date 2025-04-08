package com.xworkz.Inheritence.internal;


import com.xworkz.Inheritence.External.Specks;

public class LensKart extends Specks {
    public LensKart() {
        super();
        System.out.println("No args const in LensKart");
    }

    @Override
    public void color() {
        super.color();
    }

    @Override
    public void duration() {
        super.duration();
    }

    @Override
    public void lens() {
        super.lens();
    }

    @Override
    public void quality() {
        super.quality();
    }

    @Override
    public void type() {
        super.type();
    }

    public void metal() {
        System.out.println("metal color");
    }
}

