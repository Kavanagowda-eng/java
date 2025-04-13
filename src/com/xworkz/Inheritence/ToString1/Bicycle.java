package com.xworkz.Inheritence.ToString1;

public class Bicycle {
    private String brand;
    private int type;
    private boolean gearCount;

    public Bicycle(String brand, int type, boolean gearCount) {
        this.brand = brand;
        this.type = type;
        this.gearCount = gearCount;
    }

    @Override
    public String toString() {
        return "Bicycle: brand=" + brand + ", type=" + type + ", gearCount=" + gearCount;
    }

    @Override
    public int hashCode() {
        return 90;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Bicycle) {
            Bicycle bicycle1 = this;
            Bicycle bicycle2= (Bicycle) obj;
            if (bicycle1.brand ==bicycle2.brand) {
                return true;
            }
        }
        return false;
    }

}
