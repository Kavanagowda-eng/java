package com.xworkz.Inheritence.internal;
import com.xworkz.Inheritence.External.Clock;

public class Casio extends Clock {
    public Casio(){
        super();
        System.out.println("No args const in casio");
    }

    @Override
    public void color() {
        super.color();
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void quality() {
        super.quality();
    }

    @Override
    public void lens() {
        super.lens();
    }

    @Override
    public void duration() {
        super.duration();
    }

    public void Color() {
        System.out.println("color of the clock");
    }
}
