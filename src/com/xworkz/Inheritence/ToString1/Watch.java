package com.xworkz.Inheritence.ToString1;

public class Watch {
    private String brand;
    private int type;
    private boolean isSmart;

    public Watch(String brand, int type, boolean isSmart) {
        this.brand = brand;
        this.type = type;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Watch: brand=" + brand + ", type=" + type + ", isSmart=" + isSmart;
    }

}
