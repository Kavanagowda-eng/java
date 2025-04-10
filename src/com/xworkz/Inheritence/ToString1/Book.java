package com.xworkz.Inheritence.ToString1;

public class Book {
    private String brand;
    private int type;
    private boolean gearCount;

    public Book(String brand, int type, boolean gearCount) {
        this.brand = brand;
        this.type = type;
        this.gearCount = gearCount;
    }

    @Override
    public String toString() {
        return "Bicycle: brand=" + brand + ", type=" + type + ", gearCount=" + gearCount;
    }

    @Override
    public int hashCode() {
        return 56;
    }
}

