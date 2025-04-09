package com.xworkz.Inheritence.ToString1;

public class Printer {
    private String brand;
    private int type;
    private boolean isColor;

    public Printer(String brand, int type, boolean isColor) {
        this.brand = brand;
        this.type = type;
        this.isColor = isColor;
    }

    @Override
    public String toString() {
        return "Printer: brand=" + brand + ", type=" + type + ", isColor=" + isColor;
    }
}
