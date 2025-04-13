package com.xworkz.Inheritence.ToString1;

public class Island {
    private String name;
    private int area;
    private boolean inhabited;

    public Island(String name, int area, boolean inhabited) {
        this.name = name;
        this.area = area;
        this.inhabited = inhabited;
    }

    @Override
    public String toString() {
        return "Island: name=" + name + ", area=" + area + ", inhabited=" + inhabited;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Island){
            Island island1=this;
            Island island2=(Island) obj;
            if(island1.name== island2.name){
                return true;
            }
        }
        return false;
}

}
