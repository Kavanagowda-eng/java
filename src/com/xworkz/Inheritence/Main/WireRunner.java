package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Wire;
import com.xworkz.Inheritence.internal.ElectricWire;
public class WireRunner {

        public static void main(String[] args) {
            Wire wire = new Wire();
            wire.conductElectricity();
            wire.checkInsulation();
            wire.measureLength();
            wire.connectDevices();
            wire.rollWire();

            Wire wire1 = new ElectricWire();
            wire1.conductElectricity();
            wire1.checkInsulation();
            wire1.measureLength();
            wire1.connectDevices();
            wire1.rollWire();

            Wire wire2 = new ElectricWire();
            wire2.conductElectricity();
            wire2.checkInsulation();
            wire2.measureLength();
            wire2.connectDevices();
            wire2.rollWire();

            Wire wire3 = new ElectricWire();
            wire3.conductElectricity();
            wire3.checkInsulation();
            wire3.measureLength();
            wire3.connectDevices();
            wire3.rollWire();
        }
    }

