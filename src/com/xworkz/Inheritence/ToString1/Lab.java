package com.xworkz.Inheritence.ToString1;

public class Lab {
    private String equipments;
    private int technicians;
    private boolean isCertified;

    public Lab(String equipments, int technicians, boolean isCertified) {
        this.equipments = equipments;
        this.technicians = technicians;
        this.isCertified = isCertified;
    }

    @Override
    public String toString() {
        return "Lab: equipments=" + equipments + ", technicians=" + technicians + ", isCertified=" + isCertified;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Lab) {
            Lab lab1 = this;
            Lab lab2= (Lab) obj;
            if (lab1.equipments== lab2.equipments && lab1.technicians== lab2.technicians) {
                return true;
            }
        }
        return false;
    }

}
