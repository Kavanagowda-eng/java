package com.xworkz.Inheritence.ToString1;

public class Scooter {
    private String brand;
    private int engineCC;
    private boolean type;

    public Scooter(String brand, int engineCC, boolean type) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Scooter: brand=" + brand + ", engineCC=" + engineCC + ", type=" + type;
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
        if (obj instanceof Scooter) {
            Scooter scooter1 = this;
           Scooter scooter2= (Scooter) obj;
            if (scooter1.brand==scooter2.brand && scooter1.engineCC==scooter2.engineCC && scooter1.type==scooter2.type) {
                return true;
            }
        }
        return false;
    }
}
