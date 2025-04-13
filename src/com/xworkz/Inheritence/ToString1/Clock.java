package com.xworkz.Inheritence.ToString1;

public class Clock {
    private String type;
    private int brand;
    private boolean hasAlarm;

    public Clock(String type, int brand, boolean hasAlarm) {
        this.type = type;
        this.brand = brand;
        this.hasAlarm = hasAlarm;
    }

    @Override
    public String toString() {
        return "Clock: type=" + type + ", brand=" + brand + ", hasAlarm=" + hasAlarm;
    }
    @Override
    public int hashCode() {
        return 45;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Clock){
            Clock clock1=this;
            Clock clock2=(Clock) obj;
            if(clock1.type==clock2.type){
                return true;
            }
        }
        return false;
    }
}

