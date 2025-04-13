package com.xworkz.Inheritence.ToString1;

public class Road {
    private String length;
    private int type;
    private boolean hasLaneMarkings;

    public Road(String length, int type, boolean hasLaneMarkings) {
        this.length = length;
        this.type = type;
        this.hasLaneMarkings = hasLaneMarkings;
    }

    @Override
    public String toString() {
        return "Road: length=" + length + ", type=" + type + ", hasLaneMarkings=" + hasLaneMarkings;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Road) {
            Road road1= this;
            Road road2= (Road) obj;
            if (road1.length==road2.length && road1.type== road2.type && road1.hasLaneMarkings==road2.hasLaneMarkings) {
                return true;
            }
        }
        return false;
    }
}

