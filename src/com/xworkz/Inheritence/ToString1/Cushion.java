package com.xworkz.Inheritence.ToString1;

public class Cushion {
    private String color;
    private int size;
    private boolean material;

    public Cushion(String color, int size, boolean material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cushion: color=" + color + ", size=" + size + ", material=" + material;
    }
    }
