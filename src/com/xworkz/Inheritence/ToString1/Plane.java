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
    @Override
    public int hashCode() {
        return 96;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Plane) {
            Plane plane1 = this;
            Plane plane2= (Plane) obj;
            if (plane1.model== plane2.model && plane1.seats== plane2.seats && plane1.isCommercial== plane2.isCommercial) {
                return true;
            }
        }
        return false;
    }

}
