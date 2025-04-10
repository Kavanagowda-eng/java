package com.xworkz.Inheritence.ToString1;

public class Ship {
    private String name;
    private int tonnage;
    private boolean type;

    public Ship(String name, int tonnage, boolean type) {
        this.name = name;
        this.tonnage = tonnage;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ship: name=" + name + ", tonnage=" + tonnage + ", type=" + type;
    }
    @Override
    public int hashCode() {
        return 94;
    }
}
