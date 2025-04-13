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

    @Override
    public int hashCode() {
        return 89;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Building) {
           Building building1=this;
            Building building2=(Building) obj;
            if(building1.floors==building2.floors){
                return true;
            }
        }
        return false;
    }

}
