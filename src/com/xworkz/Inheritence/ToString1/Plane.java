package com.xworkz.Inheritence.ToString1;

public class Plane {
    private String model;
    private int seats;
    private boolean isCommercial;

    public Plane(String model, int seats, boolean isCommercial) {
        this.model = model;
        this.seats = seats;
        this.isCommercial = isCommercial;
    }

    @Override
    public String toString() {
        return "Plane: model=" + model + ", seats=" + seats + ", isCommercial=" + isCommercial;
    }

}
