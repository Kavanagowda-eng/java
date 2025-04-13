package com.xworkz.Inheritence.ToString1;

public class Cushion {
    private String color;
    private int size;
    private boolean material;

    public Cushion(String color, int size, boolean material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cushion: color=" + color + ", size=" + size + ", material=" + material;
    }
    @Override
    public int hashCode() {
        return 45;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cushion){
            Cushion cushion1=this;
            Cushion cushion2=(Cushion) obj;
            if(cushion1.color== cushion2.color){
                return true;
            }
        }
        return false;
    }
}

