package com.xworkz.Inheritence.ToString1;

public class Zoo {
    private String animals;
    private int area;
    private boolean hasAquarium;

    public Zoo(String animals, int area, boolean hasAquarium) {
        this.animals = animals;
        this.area = area;
        this.hasAquarium = hasAquarium;
    }

    @Override
    public String toString() {
        return "Zoo: animals=" + animals + ", area=" + area + ", hasAquarium=" + hasAquarium;
    }
    @Override
    public int hashCode() {
        return 45;}
}
