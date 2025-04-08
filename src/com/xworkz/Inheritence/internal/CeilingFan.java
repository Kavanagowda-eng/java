package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Fan;

public class CeilingFan extends Fan {

    public CeilingFan() {
        super();
        System.out.println("CeilingFan is a subclass");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void displayType() {
        super.displayType();
    }

    @Override
    public void oscillate() {
        super.oscillate();
    }

    @Override
    public void setSpeed() {
        super.setSpeed();
    }

    @Override
    public void startFan() {
        super.startFan();
    }

    @Override
    public void stopFan() {
        super.stopFan();
    }
    public void color() {
        System.out.println("color of the Fanerride");
    }
}

