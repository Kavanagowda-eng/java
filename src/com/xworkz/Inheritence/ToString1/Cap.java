package com.xworkz.Inheritence.ToString1;

public class Cap {
    private String brand;
    private int size;
    private boolean type;

    public Cap(String brand, int size, boolean type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cap: brand=" + brand + ", size=" + size + ", type=" + type;
    }
    @Override
    public int hashCode() {
        return 45;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cap){
            Cap  cap1=this;
              Cap cap2=(Cap) obj;
            if(cap1.brand==cap2.brand){
                return true;
            }
        }
        return false;
    }
}
