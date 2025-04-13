package com.xworkz.Inheritence.ToString1;

public class Helmet {
    private String brand;
    private int size;
    private boolean type;

    public Helmet(String brand, int size, boolean type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Helmet: brand=" + brand + ", size=" + size + ", type=" + type;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Gym){
           Helmet helmet1=this;
            Helmet helmet2=(Helmet) obj;
            if(helmet1.brand== helmet2.brand){
                return true;
            }
        }
        return false;
    }}

