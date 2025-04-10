package com.xworkz.Inheritence.ToString1;

public class Kitchen {
    private String appliances;
    private int size;
    private boolean hasIsland;

    public Kitchen(String appliances, int size, boolean hasIsland) {
        this.appliances = appliances;
        this.size = size;
        this.hasIsland = hasIsland;
    }

    @Override
    public String toString() {
        return "Kitchen: appliances=" + appliances + ", size=" + size + ", hasIsland=" + hasIsland;
    }
    @Override
    public int hashCode() {
        return 93;}
}
