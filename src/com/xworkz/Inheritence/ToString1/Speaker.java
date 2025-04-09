package com.xworkz.Inheritence.ToString1;

public class Speaker {
    private String brand;
    private int wattage;
    private boolean isBluetooth;

    public Speaker(String brand, int wattage, boolean isBluetooth) {
        this.brand = brand;
        this.wattage = wattage;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public String toString() {
        return "Speaker: brand=" + brand + ", wattage=" + wattage + ", isBluetooth=" + isBluetooth;
    }

}
