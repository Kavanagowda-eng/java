package com.xworkz.Inheritence.ToString1;

public class Scanner {
    private String resolution;
    private int brand;
    private boolean speed;

    public Scanner(String resolution, int brand, boolean speed) {
        this.resolution = resolution;
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Scanner: resolution=" + resolution + ", brand=" + brand + ", speed=" + speed;
    }
    @Override
    public int hashCode() {
        return 94;
    }
}
