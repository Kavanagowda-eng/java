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
}

