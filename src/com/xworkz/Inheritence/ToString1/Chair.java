package com.xworkz.Inheritence.ToString1;

public class Chair {
    private String material;
    private int legs;
    private boolean color;

    public Chair(String material, int legs, boolean color) {
        this.material = material;
        this.legs = legs;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chair: material=" + material + ", legs=" + legs + ", color=" + color;
    }
}
