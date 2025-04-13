package com.xworkz.Inheritence.ToString1;

public class Headphone {
    private String brand;
    private int type;
    private boolean noiseCancelling;

    public Headphone(String brand, int type, boolean noiseCancelling) {
        this.brand = brand;
        this.type = type;
        this.noiseCancelling = noiseCancelling;
    }

    @Override
    public String toString() {
        return "Headphone: brand=" + brand + ", type=" + type + ", noiseCancelling=" + noiseCancelling;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Headphone){
            Headphone headphone1=this;
           Headphone headphone2=(Headphone) obj;
            if(headphone1.brand== headphone2.brand){
                return true;
            }
        }
        return false;
    }}

