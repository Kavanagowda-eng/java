package com.xworkz.Inheritence.ToString1;

public class Park {
    private String waist;
    private int length;
    private boolean brand;

    public Park(String waist, int length, boolean brand) {
        this.waist = waist;
        this.length = length;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Park : waist=" + waist + ", length=" + length + ", brand=" + brand;
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
        if (obj instanceof Park) {
            Park park1 = this;
            Park park2= (Park) obj;
            if (park1.waist==park2.waist && park1.length== park2.length) {
                return true;
            }
        }
        return false;
}
}
