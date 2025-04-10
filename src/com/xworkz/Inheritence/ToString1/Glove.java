package com.xworkz.Inheritence.ToString1;

public class Glove {
    private String material;
    private int size;
    private boolean color;

    public Glove(String material, int size, boolean color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Glove: material=" + material + ", size=" + size + ", color=" + color;
    }
    @Override
    public int hashCode() {
        return 93;}
}
