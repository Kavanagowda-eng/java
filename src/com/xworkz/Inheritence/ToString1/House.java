package com.xworkz.Inheritence.ToString1;

public class House {
    private String rooms;
    private int area;
    private boolean hasGarage;

    public House(String rooms, int area, boolean hasGarage) {
        this.rooms = rooms;
        this.area = area;
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House: rooms=" + rooms + ", area=" + area + ", hasGarage=" + hasGarage;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof House){
            House house1=this;
            House house2=(House) obj;
            if(house1.rooms== house2.rooms){
                return true;
            }
        }
        return false;
    }
}
