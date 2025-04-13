package com.xworkz.Inheritence.ToString1;

public class Jacket {
    private String brand;
    private int size;
    private boolean isWaterproof;

    public Jacket(String brand, int size, boolean isWaterproof) {
        this.brand = brand;
        this.size = size;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "Jacket: brand=" + brand + ", size=" + size + ", isWaterproof=" + isWaterproof;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Jacket) {
            Jacket jacket1 = this;
            Jacket jacket2= (Jacket) obj;
            if (jacket1.brand == jacket2.brand && jacket1.size== jacket2.size) {
                return true;
            }
        }
        return false;
    }

}
