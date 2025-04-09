package com.xworkz.Inheritence.ToString1;

public class Fence {
    private String material;
    private int height;
    private boolean color;

    public Fence(String material, int height, boolean color) {
        this.material = material;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fence: material=" + material + ", height=" + height + ", color=" + color;
    }
}
