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
        return 93;}
}
