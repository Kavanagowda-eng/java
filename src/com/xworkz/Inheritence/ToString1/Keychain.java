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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Keychain) {
            Keychain keychain1 = this;
            Keychain keychain2= (Keychain) obj;
            if (keychain1.material== keychain2.material && keychain1.length== keychain2.length) {
                return true;
            }
        }
        return false;
    }

}
