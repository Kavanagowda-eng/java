package com.xworkz.Inheritence.ToString1;

public class Drone {
    private String brand;
    private int range;
    private boolean hasCamera;

    public Drone(String brand, int range, boolean hasCamera) {
        this.brand = brand;
        this.range = range;
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString() {
        return "Drone: brand=" + brand + ", range=" + range + ", hasCamera=" + hasCamera;
    }
    @Override
    public int hashCode() {
        return 93;}
}
