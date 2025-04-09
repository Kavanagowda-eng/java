package com.xworkz.Inheritence.ToString1;

public class Headphone {
    private String brand;
    private int type;
    private boolean noiseCancelling;

    public Headphone(String brand, int type, boolean noiseCancelling) {
        this.brand = brand;
        this.type = type;
        this.noiseCancelling = noiseCancelling;
    }

    @Override
    public String toString() {
        return "Headphone: brand=" + brand + ", type=" + type + ", noiseCancelling=" + noiseCancelling;
    }
}
