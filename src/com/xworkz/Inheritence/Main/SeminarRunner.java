package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Seminar;
import com.xworkz.Inheritence.internal.Techy;

public class SeminarRunner {
    public static void main(String[] args){
        Seminar seminar=new Seminar();
        seminar.date();
        seminar.student();
        seminar.schedule();
        seminar.time();
        seminar.topic();

        Seminar seminar1=new Techy();
        seminar1.topic();
        seminar1.time();
        seminar1.date();
        seminar1.student();
        seminar1.schedule();

        Seminar seminar2=new Techy();
        seminar2.topic();
        seminar2.time();
        seminar2.date();
        seminar2.student();
        seminar2.schedule();

        Seminar seminar3=new Techy();
        seminar3.topic();
        seminar3.time();
        seminar3.date();
        seminar3.student();
        seminar3.schedule();
    }

}
