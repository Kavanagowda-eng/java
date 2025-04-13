package com.xworkz.Inheritence.ToString1;

public class Drone {
    private String brand;
    private int range;
    private boolean hasCamera;

    public Drone(String brand, int range, boolean hasCamera) {
        this.brand = brand;
        this.range = range;
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString() {
        return "Drone: brand=" + brand + ", range=" + range + ", hasCamera=" + hasCamera;
    }
    @Override
    public int hashCode() {
        return 93;}
@Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Drone){
            Drone drone1=this;
            Drone drone2=(Drone)obj;
            if(drone1.brand==drone2.brand){
                return true;
            }
        }
        return false;
}
}
