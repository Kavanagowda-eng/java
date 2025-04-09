package com.xworkz.Inheritence.ToString1;

public class Apartment {
    private String floor;
    private int area;
    private boolean balconies;

    public Apartment(String floor, int area, boolean balconies) {
        this.floor = floor;
        this.area = area;
        this.balconies = balconies;
    }

    @Override
    public String toString() {
        return "Apartment: floor=" + floor + ", area=" + area + ", balconies=" + balconies;
    }
}
