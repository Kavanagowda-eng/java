package com.xworkz.Inheritence.ToString1;

public class Theatre {
    private String seats;
    private int screenSize;
    private boolean is3D;

    public Theatre(String seats, int screenSize, boolean is3D) {
        this.seats = seats;
        this.screenSize = screenSize;
        this.is3D = is3D;
    }

    @Override
    public String toString() {
        return "Theatre: seats=" + seats + ", screenSize=" + screenSize + ", is3D=" + is3D;
    }
}
