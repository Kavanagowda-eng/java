package com.xworkz.Inheritence.ToString1;

public class Robot {
    private String name;
    private int purpose;
    private boolean batteryLife;

    public Robot(String name, int purpose, boolean batteryLife) {
        this.name = name;
        this.purpose = purpose;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Robot: name=" + name + ", purpose=" + purpose + ", batteryLife=" + batteryLife;
    }
}

