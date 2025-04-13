package com.xworkz.Inheritence.ToString1;

public class Forest {
    private String trees;
    private int animals;
    private boolean area;

    public Forest(String trees, int animals, boolean area) {
        this.trees = trees;
        this.animals = animals;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Forest: trees=" + trees + ", animals=" + animals + ", area=" + area;
    }

    @Override
    public int hashCode() {
        return 93;
    }

@Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Forest) {
            Forest forest1 = this;
            Forest forest2 = (Forest) obj;
            if (forest1.trees == forest2.trees) {

                return true;
            }
        }
        return false;
    }
}
