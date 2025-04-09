package com.xworkz.Inheritence.ToString1;

public class AirConditioner {
        private String brand;
        private int tonnage;
        private boolean inverter;

        public AirConditioner(String brand, int tonnage, boolean inverter) {
            this.brand = brand;
            this.tonnage = tonnage;
            this.inverter = inverter;
        }

        @Override
        public String toString() {
            return "AirConditioner: brand=" + brand + ", tonnage=" + tonnage + ", inverter=" + inverter;
        }
    }
