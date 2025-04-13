package com.xworkz.Inheritence.ToString1;

public class Bathroom {
    private String hasShower;
    private int size;
    private boolean tilesColor;

    public Bathroom(String hasShower, int size, boolean tilesColor) {
        this.hasShower = hasShower;
        this.size = size;
        this.tilesColor = tilesColor;
    }

    @Override
    public String toString() {
        return "Bathroom: hasShower=" + hasShower + ", size=" + size + ", tilesColor=" + tilesColor;
    }

    @Override
    public int hashCode() {
        return 95;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Bar) {
            Bathroom bathroom1 = this;
            Bathroom bathroom2= (Bathroom) obj;
            if (bathroom1.hasShower ==bathroom2.hasShower) {
                return true;
            }
        }
        return false;
    }

}

