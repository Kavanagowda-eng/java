package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.PowerBank;

public class Anker extends PowerBank {
    public Anker() {
        super();
        System.out.println("No args const in Anker");
    }

    @Override
    public void charge() {
        super.charge();
    }

    @Override
    public void recharge() {
        super.recharge();
    }

    @Override
    public void connect() {
        super.connect();
    }

    @Override
    public void wire() {
        super.wire();
    }

    @Override
    public void type() {
        super.type();
    }

    public void color() {
        System.out.println("color of PowerBank");
    }
}
