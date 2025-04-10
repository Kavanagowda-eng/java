package com.xworkz.Inheritence.ToString1;

public class Teacher {
    private String name;
    private int subject;
    private boolean experience;

    public Teacher(String name, int subject, boolean experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher: name=" + name + ", subject=" + subject + ", experience=" + experience;
    }
    @Override
    public int hashCode() {
        return 89;}
}
