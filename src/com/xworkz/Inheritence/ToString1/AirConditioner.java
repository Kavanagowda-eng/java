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

    @Override
    public int hashCode() {
        return 96;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof AirConditioner) {
            AirConditioner airConditioner1 = this;
            AirConditioner airConditioner2 = (AirConditioner) obj;
            if (airConditioner1.brand == airConditioner2.brand) {
                return true;
            }
        }
        return false;
    }

    }

