package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Appliance;

public class WashingMachine extends Appliance {
    public WashingMachine() {
        super();
        System.out.println("Washing Machine is a subclass");
    }

    @Override
    public void consumeElectricity() {
        super.consumeElectricity();
    }

    @Override
    public void maintenance() {
        super.maintenance();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
    public void repair(){
        System.out.println("repair the appliance");
    }
}

