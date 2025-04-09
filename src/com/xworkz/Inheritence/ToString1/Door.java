package com.xworkz.Inheritence.ToString1;

public class Door {
    private String material;
    private int height;
    private boolean isSliding;

    public Door(String material, int height, boolean isSliding) {
        this.material = material;
        this.height = height;
        this.isSliding = isSliding;
    }

    @Override
    public String toString() {
        return "Door: material=" + material + ", height=" + height + ", isSliding=" + isSliding;
    }
}
