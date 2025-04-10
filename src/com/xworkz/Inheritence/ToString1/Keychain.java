package com.xworkz.Inheritence.ToString1;

public class Keychain {
    private String material;
    private int length;
    private boolean brand;

    public Keychain(String material, int length, boolean brand) {
        this.material = material;
        this.length = length;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Keychain: material=" + material + ", length=" + length + ", brand=" + brand;
    }
    @Override
    public int hashCode() {
        return 93;}

}
