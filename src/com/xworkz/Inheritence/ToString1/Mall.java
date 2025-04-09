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

}
