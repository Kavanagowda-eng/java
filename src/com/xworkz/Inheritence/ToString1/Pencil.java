package com.xworkz.Inheritence.ToString1;

public class Pencil {
    private String hardness;
    private int length;
    private boolean brand;

    public Pencil(String hardness, int length, boolean brand) {
        this.hardness = hardness;
        this.length = length;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pencil: hardness=" + hardness + ", length=" + length + ", brand=" + brand;
    }
}
