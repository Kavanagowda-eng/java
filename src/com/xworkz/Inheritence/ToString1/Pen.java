package com.xworkz.Inheritence.ToString1;

public class Pen {
    private String color;
    private int type;
    private boolean brand;

    public Pen(String color, int type, boolean brand) {
        this.color = color;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pen: color=" + color + ", type=" + type + ", brand=" + brand;
    }
    @Override
    public int hashCode() {
        return 94;
    }

}
