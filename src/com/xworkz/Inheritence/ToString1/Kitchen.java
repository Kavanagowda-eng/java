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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Kitchen) {
            Kitchen kitchen1 = this;
            Kitchen kitchen2= (Kitchen) obj;
            if (kitchen1.appliances== kitchen2.appliances && kitchen1.size== kitchen2.size) {
                return true;
            }
        }
        return false;
    }

}
