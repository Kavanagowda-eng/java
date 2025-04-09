package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Appliance;
import com.xworkz.Inheritence.internal.WashingMachine;

public class ApplianceCast {
    public void turnoff(Appliance appliance) {
        appliance.consumeElectricity();
        appliance.maintenance();
        appliance.turnOff();
        appliance.turnOn();
        appliance.repair();

        if (appliance instanceof WashingMachine) {
            WashingMachine washingMachine = new WashingMachine();
            washingMachine.repair();
        }
    }
}
