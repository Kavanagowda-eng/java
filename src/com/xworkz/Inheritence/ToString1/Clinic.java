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
    @Override
    public int hashCode() {
        return 45;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cafe){
           Clinic clinic1=this;
           Clinic clinic2=(Clinic) obj;
           if(clinic1.doctors==clinic2.doctors){
                return true;
            }
        }
        return false;
    }
}

