package com.xworkz.Inheritence.ToString1;

public class Clinic {
    private String doctors;
    private int rooms;
    private boolean isSpecialized;

    public Clinic(String doctors, int rooms, boolean isSpecialized) {
        this.doctors = doctors;
        this.rooms = rooms;
        this.isSpecialized = isSpecialized;
    }

    @Override
    public String toString() {
        return "Clinic: doctors=" + doctors + ", rooms=" + rooms + ", isSpecialized=" + isSpecialized;
    }
}
