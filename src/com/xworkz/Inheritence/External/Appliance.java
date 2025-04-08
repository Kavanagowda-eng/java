package com.xworkz.Inheritence.External;

public class Appliance {

        public Appliance(){
            System.out.println("Appliance is the superclass");
        }

        public void turnOn() {
            System.out.println("Appliance is turned on");
        }

        public void turnOff() {
            System.out.println("Appliance is turned off");
        }

        public void consumeElectricity() {
            System.out.println("Appliance consumes electricity");
        }

        public void maintenance() {
            System.out.println("Appliance requires regular maintenance");
        }

        public void repair(){System.out.println("Appliance requires repair ");}
    }

