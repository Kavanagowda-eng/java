package com.xworkz.Inheritence.ToString1;

public class Bottle {
    private String material;
    private int capacity;
    private boolean isReusable;

    public Bottle(String material, int capacity, boolean isReusable) {
        this.material = material;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    @Override
    public String toString() {
        return "Bottle: material=" + material + ", capacity=" + capacity + ", isReusable=" + isReusable;
    }

    @Override
    public int hashCode() {
        return 45;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Bottle) {
            Bottle bottle1 = this;
            Bottle bottle2= (Bottle) obj;
            if (bottle1.material ==bottle2.material) {
                return true;
            }
        }
        return false;
    }

}
