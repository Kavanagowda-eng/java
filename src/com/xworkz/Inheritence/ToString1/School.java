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
}
