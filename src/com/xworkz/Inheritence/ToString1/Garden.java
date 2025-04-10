package com.xworkz.Inheritence.ToString1;

public class Garden {
    private String plants;
    private int area;
    private boolean hasFountain;

    public Garden(String plants, int area, boolean hasFountain) {
        this.plants = plants;
        this.area = area;
        this.hasFountain = hasFountain;
    }

    @Override
    public String toString() {
        return "Garden: plants=" + plants + ", area=" + area + ", hasFountain=" + hasFountain;
    }
    @Override
    public int hashCode() {
        return 93;}
}
