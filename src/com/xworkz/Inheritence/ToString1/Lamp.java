package com.xworkz.Inheritence.ToString1;

public class Lamp {
    private String type;
    private int wattage;
    private boolean brand;

    public Lamp(String type, int wattage, boolean brand) {
        this.type = type;
        this.wattage = wattage;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Lamp: type=" + type + ", wattage=" + wattage + ", brand=" + brand;
    }
    @Override
    public int hashCode() {
        return 93;}
}
