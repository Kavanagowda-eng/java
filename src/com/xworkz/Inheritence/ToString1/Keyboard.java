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
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Keyboard) {
            Keyboard keyboard1 = this;
           Keyboard keyboard2= (Keyboard) obj;
            if (keyboard1.brand== keyboard2.brand && keyboard1.type== keyboard2.type) {
                return true;
            }
        }
        return false;
    }

}
