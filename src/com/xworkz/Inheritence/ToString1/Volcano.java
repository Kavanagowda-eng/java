package com.xworkz.Inheritence.ToString1;

public class Volcano {
    private String name;
    private int height;
    private boolean isActive;

    public Volcano(String name, int height, boolean isActive) {
        this.name = name;
        this.height = height;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Volcano: name=" + name + ", height=" + height + ", isActive=" + isActive;
    }

}
