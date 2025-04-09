package com.xworkz.Inheritence.ToString1;

public class Stadium {
    private String capacity;
    private int type;
    private boolean hasRoof;

    public Stadium(String capacity, int type, boolean hasRoof) {
        this.capacity = capacity;
        this.type = type;
        this.hasRoof = hasRoof;
    }

    @Override
    public String toString() {
        return "Stadium: capacity=" + capacity + ", type=" + type + ", hasRoof=" + hasRoof;
    }
}
