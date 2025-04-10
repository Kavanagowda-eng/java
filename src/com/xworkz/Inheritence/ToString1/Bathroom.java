package com.xworkz.Inheritence.ToString1;

public class Bathroom {
    private String hasShower;
    private int size;
    private boolean tilesColor;

    public Bathroom(String hasShower, int size, boolean tilesColor) {
        this.hasShower = hasShower;
        this.size = size;
        this.tilesColor = tilesColor;
    }

    @Override
    public String toString() {
        return "Bathroom: hasShower=" + hasShower + ", size=" + size + ", tilesColor=" + tilesColor;
    }

    @Override
    public int hashCode() {
        return 95;
    }
}
