package com.xworkz.Inheritence.ToString1;

public class Clock {
    private String type;
    private int brand;
    private boolean hasAlarm;

    public Clock(String type, int brand, boolean hasAlarm) {
        this.type = type;
        this.brand = brand;
        this.hasAlarm = hasAlarm;
    }

    @Override
    public String toString() {
        return "Clock: type=" + type + ", brand=" + brand + ", hasAlarm=" + hasAlarm;
    }
}
