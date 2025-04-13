package com.xworkz.Inheritence.ToString1;

public class Pants {
    private String waist;
    private int length;
    private boolean brand;

    public Pants(String waist, int length, boolean brand) {
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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Pants) {
            Pants pants1 = this;
            Pants pants2 = (Pants) obj;
            if (pants1.waist == pants2.waist && pants1.length == pants2.length) {
                return true;
            }
        }
        return false;
    }
}