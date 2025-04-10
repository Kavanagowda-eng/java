package com.xworkz.Inheritence.ToString1;

public class Park {
    private String waist;
    private int length;
    private boolean brand;

    public Park(String waist, int length, boolean brand) {
        this.waist = waist;
        this.length = length;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pants: waist=" + waist + ", length=" + length + ", brand=" + brand;
    }
    @Override
    public int hashCode() {
        return 94;
    }
}
