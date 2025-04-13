package com.xworkz.Inheritence.ToString1;

public class Lamp {
    private String type;
    private int wattage;
    private boolean brand;

    public Lamp(String type, int wattage, boolean brand) {
        this.type = type;
        this.wattage = wattage;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Lamp: type=" + type + ", wattage=" + wattage + ", brand=" + brand;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Lamp) {
           Lamp lamp1 = this;
            Lamp lamp2= (Lamp) obj;
            if (lamp1.type== lamp2.type && lamp1.wattage== lamp2.wattage) {
                return true;
            }
        }
        return false;
}
}
