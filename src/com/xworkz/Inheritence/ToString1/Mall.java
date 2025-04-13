package com.xworkz.Inheritence.ToString1;

public class Mall {
    private String shops;
    private int floors;
    private boolean hasFoodCourt;

    public Mall(String shops, int floors, boolean hasFoodCourt) {
        this.shops = shops;
        this.floors = floors;
        this.hasFoodCourt = hasFoodCourt;
    }

    @Override
    public String toString() {
        return "Mall: shops=" + shops + ", floors=" + floors + ", hasFoodCourt=" + hasFoodCourt;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Mall) {
            Mall mall1 = this;
            Mall mall2= (Mall) obj;
            if (mall1.shops== mall2.shops && mall1.hasFoodCourt== mall2.hasFoodCourt) {
                return true;
            }
        }
        return false;
    }
}
