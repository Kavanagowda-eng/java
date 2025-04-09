package com.xworkz.Inheritence.ToString1;

public class University {
    private String name;
    private int ranking;
    private boolean students;

    public University(String name, int ranking, boolean students) {
        this.name = name;
        this.ranking = ranking;
        this.students = students;
    }

    @Override
    public String toString() {
        return "University: name=" + name + ", ranking=" + ranking + ", students=" + students;
    }
}
