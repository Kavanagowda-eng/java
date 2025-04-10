package com.xworkz.Inheritence.ToString1;

public class Umbrella {
    private String color;
    private int size;
    private boolean isAutomatic;

    public Umbrella(String color, int size, boolean isAutomatic) {
        this.color = color;
        this.size = size;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "Umbrella: color=" + color + ", size=" + size + ", isAutomatic=" + isAutomatic;
    }
    @Override
    public int hashCode() {
        return 89;}
}

