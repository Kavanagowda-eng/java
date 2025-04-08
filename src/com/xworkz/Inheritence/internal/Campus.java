package com.xworkz.Inheritence.internal;

public class Campus extends College{
    public Campus(){
        super();
        System.out.println("No args const in campus");
    }

    @Override
    public void activity() {
        super.activity();
    }

    @Override
    public void events() {
        super.events();
    }

    @Override
    public void certificates() {
        super.certificates();
    }

    @Override
    public void exams() {
        super.exams();
    }

    @Override
    public void teach() {
        super.teach();
    }
    public void color() {
        System.out.println("color of the COllege");
    }

}
