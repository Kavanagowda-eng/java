package com.xworkz.Inheritence.ToString1;

public class Bag {
    private String brand;
    private int capacity;
    private boolean color;

    public Bag(String brand, int capacity, boolean color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bag: brand=" + brand + ", capacity=" + capacity + ", color=" + color;
    }
}
