package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Vehicle;

public class Car extends Vehicle {

    public Car()
    {
        super();
        System.out.println("car");
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void fuel() {
        super.fuel();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }
    public void color() {
        System.out.println("color of the car");
    }
}

