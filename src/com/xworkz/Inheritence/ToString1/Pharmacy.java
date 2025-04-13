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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Pharmacy) {
            Pharmacy pharmacy1 = this;
            Pharmacy pharmacy2= (Pharmacy) obj;
            if (pharmacy1.medicines== pharmacy2.medicines && pharmacy1.staff== pharmacy2.staff && pharmacy1.is24Hours== pharmacy2.is24Hours) {
                return true;
            }
        }
        return false;
    }

}

