package com.xworkz.Inheritence.ToString1;

public class Sunglasses {
    private String brand;
    private int uvProtection;
    private boolean type;

    public Sunglasses(String brand, int uvProtection, boolean type) {
        this.brand = brand;
        this.uvProtection = uvProtection;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sunglasses: brand=" + brand + ", uvProtection=" + uvProtection + ", type=" + type;
    }
    @Override
    public int hashCode() {
        return 89;}
}

