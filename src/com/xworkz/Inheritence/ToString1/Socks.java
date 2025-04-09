package com.xworkz.Inheritence.ToString1;

public class Socks {
    private String size;
    private int material;
    private boolean color;

    public Socks(String size, int material, boolean color) {
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Socks: size=" + size + ", material=" + material + ", color=" + color;
    }
}
