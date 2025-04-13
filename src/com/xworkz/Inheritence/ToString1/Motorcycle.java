package com.xworkz.Inheritence.ToString1;

public class Motorcycle {
    private String brand;
    private int engineCC;
    private boolean type;

    public Motorcycle(String brand, int engineCC, boolean type) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorcycle: brand=" + brand + ", engineCC=" + engineCC + ", type=" + type;
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
        if (obj instanceof Motorcycle) {
            Motorcycle motorcycle1 = this;
            Motorcycle motorcycle2= (Motorcycle) obj;
            if (motorcycle1.brand== motorcycle2.brand && motorcycle1.engineCC== motorcycle2.engineCC) {
                return true;
            }
        }
        return false;
    }

}
