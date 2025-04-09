package com.xworkz.Inheritence.ToString1;

public class TV {
    private String brand;
    private int size;
    private boolean isSmart;

    public TV(String brand, int size, boolean isSmart) {
        this.brand = brand;
        this.size = size;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "TV: brand=" + brand + ", size=" + size + ", isSmart=" + isSmart;
    }

}
