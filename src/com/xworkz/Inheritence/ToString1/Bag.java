package com.xworkz.Inheritence.ToString1;

public class Bag {
    private String brand;
    private int capacity;
    private boolean color;

    public Bag(String brand, int capacity, boolean color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bag: brand=" + brand + ", capacity=" + capacity + ", color=" + color;
    }

    @Override
    public int hashCode() {
        return 97;
    }

@Override
public boolean equals(Object obj) {
    if (obj != null) {
        System.out.println("not null");
    }
    if (obj instanceof Bag) {
        Bag bag1 = this;
        Bag bag2 = (Bag) obj;
        if (bag1.brand == bag2.brand) {
            return true;
        }
    }
    return false;
}
}



