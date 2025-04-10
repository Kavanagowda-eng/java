package com.xworkz.Inheritence.ToString1;

public class Cafe {
    private String drinks;
    private int seats;
    private boolean isOpenLate;

    public Cafe(String drinks, int seats, boolean isOpenLate) {
        this.drinks = drinks;
        this.seats = seats;
        this.isOpenLate = isOpenLate;
    }

    @Override
    public String toString() {
        return "Cafe: drinks=" + drinks + ", seats=" + seats + ", isOpenLate=" + isOpenLate;
    }
    @Override
    public int hashCode() {
        return 45;
}
}
