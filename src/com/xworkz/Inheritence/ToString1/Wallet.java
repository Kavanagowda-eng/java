package com.xworkz.Inheritence.ToString1;

public class Wallet {
    private String material;
    private int brand;
    private boolean hasCoinPocket;

    public Wallet(String material, int brand, boolean hasCoinPocket) {
        this.material = material;
        this.brand = brand;
        this.hasCoinPocket = hasCoinPocket;
    }

    @Override
    public String toString() {
        return "Wallet: material=" + material + ", brand=" + brand + ", hasCoinPocket=" + hasCoinPocket;
    }
}
