package com.xworkz.Inheritence.ToString1;

public class Hospital {
    private String beds;
    private int departments;
    private boolean isPrivate;

    public Hospital(String beds, int departments, boolean isPrivate) {
        this.beds = beds;
        this.departments = departments;
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return "Hospital: beds=" + beds + ", departments=" + departments + ", isPrivate=" + isPrivate;
    }
}
