package com.xworkz.Inheritence.ToString1;

public class Keyboard {
    private String brand;
    private int type;
    private boolean isMechanical;

    public Keyboard(String brand, int type, boolean isMechanical) {
        this.brand = brand;
        this.type = type;
        this.isMechanical = isMechanical;
    }

    @Override
    public String toString() {
        return "Keyboard: brand=" + brand + ", type=" + type + ", isMechanical=" + isMechanical;
    }
}
