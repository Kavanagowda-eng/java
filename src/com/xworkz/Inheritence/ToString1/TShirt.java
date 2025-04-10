package com.xworkz.Inheritence.ToString1;

public class TShirt {
    private String color;
    private int size;
    private boolean brand;

    public TShirt(String color, int size, boolean brand) {
        this.color = color;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "TShirt: color=" + color + ", size=" + size + ", brand=" + brand;
    }
}
