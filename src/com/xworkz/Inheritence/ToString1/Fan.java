package com.xworkz.Inheritence.ToString1;

public class Fan {
    private String blades;
    private int speed;
    private boolean brand;

    public Fan(String blades, int speed, boolean brand) {
        this.blades = blades;
        this.speed = speed;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Fan: blades=" + blades + ", speed=" + speed + ", brand=" + brand;
    }
    @Override
    public int hashCode() {
        return 93;}
}
