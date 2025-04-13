package com.xworkz.Inheritence.ToString1;

public class Pencil {
    private String hardness;
    private int length;
    private boolean brand;

    public Pencil(String hardness, int length, boolean brand) {
        this.hardness = hardness;
        this.length = length;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pencil: hardness=" + hardness + ", length=" + length + ", brand=" + brand;
    }

    @Override
    public int hashCode() {
        return 93;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Pencil) {
            Pencil pencil1 = this;
            Pencil pencil2 = (Pencil) obj;
            if (pencil1.hardness == pencil2.hardness && pencil1.length == pencil2.length && pencil1.brand == pencil2.brand) {
                return true;
            }
        }
        return false;

}
}
