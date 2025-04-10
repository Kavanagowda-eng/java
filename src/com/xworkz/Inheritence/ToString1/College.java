package com.xworkz.Inheritence.ToString1;

public class College {
    private String departments;
    private int students;
    private boolean hasHostel;

    public College(String departments, int students, boolean hasHostel) {
        this.departments = departments;
        this.students = students;
        this.hasHostel = hasHostel;
    }

    @Override
    public String toString() {
        return "College: departments=" + departments + ", students=" + students + ", hasHostel=" + hasHostel;
    }
    @Override
    public int hashCode() {
        return 45;}
}
