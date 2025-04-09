package com.xworkz.Inheritence.ToString1;

public class Mouse {
    private String brand;
    private int isWireless;
    private boolean dpi;

    public Mouse(String brand, int isWireless, boolean dpi) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Mouse: brand=" + brand + ", isWireless=" + isWireless + ", dpi=" + dpi;
    }
}
