package com.xworkz.Inheritence.ToString1;

public class Bus {
    private String brand;
    private int seats;
    private boolean isElectric;

    public Bus(String brand, int seats, boolean isElectric) {
        this.brand = brand;
        this.seats = seats;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Bus: brand=" + brand + ", seats=" + seats + ", isElectric=" + isElectric;
    }

    @Override
    public int hashCode() {
        return 45;
    }
}

