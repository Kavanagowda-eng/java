package com.xworkz.Inheritence.ToString1;

public class Pharmacy {
    private String medicines;
    private int staff;
    private boolean is24Hours;

    public Pharmacy(String medicines, int staff, boolean is24Hours) {
        this.medicines = medicines;
        this.staff = staff;
        this.is24Hours = is24Hours;
    }

    @Override
    public String toString() {
        return "Pharmacy: medicines=" + medicines + ", staff=" + staff + ", is24Hours=" + is24Hours;
    }
    @Override
    public int hashCode() {
        return 95;}

}
