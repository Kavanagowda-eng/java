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
}
