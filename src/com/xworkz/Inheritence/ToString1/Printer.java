package com.xworkz.Inheritence.ToString1;

public class Printer {
    private String brand;
    private int type;
    private boolean isColor;

    public Printer(String brand, int type, boolean isColor) {
        this.brand = brand;
        this.type = type;
        this.isColor = isColor;
    }

    @Override
    public String toString() {
        return "Printer: brand=" + brand + ", type=" + type + ", isColor=" + isColor;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Printer) {
            Printer printer1 = this;
            Printer printer2= (Printer) obj;
            if (printer1.brand== printer2.brand && printer1.type==printer2.type && printer1.isColor== printer2.isColor) {
                return true;
            }
        }
        return false;
    }

}
