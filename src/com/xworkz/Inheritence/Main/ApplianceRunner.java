package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Appliance;
import com.xworkz.Inheritence.internal.WashingMachine;

public class ApplianceRunner {
        public static void main(String[] args) {
            Appliance appliance = new Appliance();
            appliance.turnOn();
            appliance.consumeElectricity();
            appliance.maintenance();
            appliance.turnOff();

            Appliance appliance1 = new WashingMachine();
            appliance1.turnOn();
            appliance1.consumeElectricity();
            appliance1.maintenance();
            appliance1.turnOff();

            Appliance appliance2 = new WashingMachine();
            appliance2.turnOn();
            appliance2.consumeElectricity();
            appliance2.maintenance();
            appliance2.turnOff();

            Appliance appliance3 = new WashingMachine();
            appliance3.turnOn();
            appliance3.consumeElectricity();
            appliance3.maintenance();
            appliance3.turnOff();

        }
    }


