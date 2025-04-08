package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Appliance;


public class ApplianceRunner {
        public static void main(String[] args) {
            Appliance appliance = new Appliance();
            appliance.turnOn();
            appliance.consumeElectricity();
            appliance.maintenance();
            appliance.turnOff();
            appliance.repair();
            System.out.println("--------------------------------");

            Appliance appliance1 = new Appliance();
            appliance1.turnOn();
            appliance1.consumeElectricity();
            appliance1.maintenance();
            appliance1.turnOff();
            appliance1.repair();
            System.out.println("--------------------------------");

            Appliance appliance2 = new Appliance();
            appliance2.turnOn();
            appliance2.consumeElectricity();
            appliance2.maintenance();
            appliance2.turnOff();
            appliance2.repair();
            System.out.println("--------------------------------");

            Appliance appliance3 = new Appliance();
            appliance3.turnOn();
            appliance3.consumeElectricity();
            appliance3.maintenance();
            appliance3.turnOff();
            appliance3.repair();
            System.out.println("--------------------------------");

        }
    }



