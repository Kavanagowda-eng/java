package com.xworkz.Inheritence.ToString1;

public class Building {
    private String floors;
    private int material;
    private boolean isCommercial;

    public Building(String floors, int material, boolean isCommercial) {
        this.floors = floors;
        this.material = material;
        this.isCommercial = isCommercial;
    }

    @Override
    public String toString() {
        return "Building: floors=" + floors + ", material=" + material + ", isCommercial=" + isCommercial;
    }
}
