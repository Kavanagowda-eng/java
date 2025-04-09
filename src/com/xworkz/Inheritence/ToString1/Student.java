package com.xworkz.Inheritence.ToString1;

public class Student {
    private String name;
    private int age;
    private boolean grade;

    public Student(String name, int age, boolean grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student: name=" + name + ", age=" + age + ", grade=" + grade;
    }
}
