package com.xworkz.Inheritence.ToString1;

public class Apartment {
    private String floor;
    private int area;
    private boolean balconies;

    public Apartment(String floor, int area, boolean balconies) {
        this.floor = floor;
        this.area = area;
        this.balconies = balconies;
    }

    @Override
    public String toString() {
        return "Apartment: floor=" + floor + ", area=" + area + ", balconies=" + balconies;
    }

    @Override
    public int hashCode() {
        return 67;
    }


@Override
public boolean equals(Object obj) {
    if (obj != null) {
        System.out.println("not null");
    }
    if (obj instanceof Apartment) {
        Apartment apartment1 = this;
        Apartment apartment2 = (Apartment) obj;
        if (apartment1.floor == apartment2.floor) {
            return true;
        }
    }
    return false;
}
}




