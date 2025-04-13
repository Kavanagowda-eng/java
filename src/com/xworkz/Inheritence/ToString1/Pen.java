package com.xworkz.Inheritence.ToString1;

public class Pen {
    private String color;
    private int type;
    private boolean brand;

    public Pen(String color, int type, boolean brand) {
        this.color = color;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pen: color=" + color + ", type=" + type + ", brand=" + brand;
    }
    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Pen) {
            Pen pen1 = this;
            Pen pen2= (Pen) obj;
            if (pen1.color== pen2.color && pen1.color== pen2.color) {
                return true;
            }
        }
        return false;
    }

}

