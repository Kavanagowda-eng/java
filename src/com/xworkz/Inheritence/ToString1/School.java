package com.xworkz.Inheritence.ToString1;

public class School {
    private String students;
    private int teachers;
    private boolean isPublic;

    public School(String students, int teachers, boolean isPublic) {
        this.students = students;
        this.teachers = teachers;
        this.isPublic = isPublic;
    }

    @Override
    public String toString() {
        return "School: students=" + students + ", teachers=" + teachers + ", isPublic=" + isPublic;
    }
    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof School) {
            School school1 = this;
            School school2= (School) obj;
            if (school1.students==school2.students && school1.teachers==school2.teachers && school1.isPublic==school2.isPublic) {
                return true;
            }
        }
        return false;
    }

}
