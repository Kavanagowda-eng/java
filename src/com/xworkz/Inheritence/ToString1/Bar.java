package com.xworkz.Inheritence.ToString1;

public class Bar {
    private String drinks;
    private int musicType;
    private boolean hasDanceFloor;

    public Bar(String drinks, int musicType, boolean hasDanceFloor) {
        this.drinks = drinks;
        this.musicType = musicType;
        this.hasDanceFloor = hasDanceFloor;
    }

    @Override
    public String toString() {
        return "Bar: drinks=" + drinks + ", musicType=" + musicType + ", hasDanceFloor=" + hasDanceFloor;
    }

    @Override
    public int hashCode() {
        return 79;
    }
}
