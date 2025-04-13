package com.xworkz.Inheritence.ToString1;

public class Fridge {
    private String brand;
    private int capacity;
    private boolean color;

    public Fridge(String brand, int capacity, boolean color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fridge: brand=" + brand + ", capacity=" + capacity + ", color=" + color;

    }
    @Override
    public int hashCode() {
        return 93;}
@Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Fridge) {
            Fridge fridge1=this;
            Fridge fridge2=(Fridge)obj;
            if(fridge1.brand== fridge2.brand){
                return true;
            }
        }
        return false;
    }
}
