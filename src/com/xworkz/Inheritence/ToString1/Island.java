package com.xworkz.Inheritence.ToString1;

public class Island {
    private String name;
    private int area;
    private boolean inhabited;

    public Island(String name, int area, boolean inhabited) {
        this.name = name;
        this.area = area;
        this.inhabited = inhabited;
    }

    @Override
    public String toString() {
        return "Island: name=" + name + ", area=" + area + ", inhabited=" + inhabited;
    }
}
