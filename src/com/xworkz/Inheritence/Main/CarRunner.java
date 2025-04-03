package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Vehicle;
import com.xworkz.Inheritence.internal.Car;

public class CarRunner {
    public static void main(String[]args){
        Vehicle vehicle=new Vehicle();
       vehicle.type();
       vehicle.drive();
       vehicle.fuel();
       vehicle.start();
       vehicle.stop();

        Vehicle vehicle1=new Car();
        vehicle1.type();
        vehicle1.drive();
        vehicle1.fuel();
        vehicle1.start();
        vehicle1.stop();

        Vehicle vehicle2=new Car();
        vehicle2.type();
        vehicle2.drive();
        vehicle2.fuel();
        vehicle2.start();
        vehicle2.stop();

        Vehicle vehicle3=new Car();
        vehicle3.type();
        vehicle3.drive();
        vehicle3.fuel();
        vehicle3.start();
        vehicle3.stop();
    }
    }
