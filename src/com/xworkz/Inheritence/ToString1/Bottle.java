package com.xworkz.Inheritence.ToString1;

public class Bottle {
    private String material;
    private int capacity;
    private boolean isReusable;

    public Bottle(String material, int capacity, boolean isReusable) {
        this.material = material;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Bottle: material=" + material + ", capacity=" + capacity + ", isReusable=" + isReusable;
    }
}
