package com.xworkz.Inheritence.ToString1;

public class Truck {
    private String brand;
    private int capacity;
    private boolean axles;

    public Truck(String brand, int capacity, boolean axles) {
        this.brand = brand;
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override
    public String toString() {
        return "Truck: brand=" + brand + ", capacity=" + capacity + ", axles=" + axles;
    }
}
