package com.xworkz.Inheritence.ToString1;

public class Ship {
    private String name;
    private int tonnage;
    private boolean type;

    public Ship(String name, int tonnage, boolean type) {
        this.name = name;
        this.tonnage = tonnage;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ship: name=" + name + ", tonnage=" + tonnage + ", type=" + type;
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
        if (obj instanceof Ship) {
            Ship ship1= this;
            Ship ship2= (Ship) obj;
            if (ship1.name==ship2.name &&ship1.tonnage==ship2.tonnage && ship1.type==ship2.type) {
                return true;
            }
        }
        return false;
    }

}
