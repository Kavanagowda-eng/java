package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Court;
import com.xworkz.Inheritence.internal.Lawyer;

public class CourtRunner {
    public static void main(String[] args) {
        Court court = new Court();
        court.judge();
        court.rules();
        court.law();
        court.type();
        court.rating();

        System.out.println("--------------------------------");

        Court court1 = new Lawyer();
        court1.judge();
        court1.rules();
        court1.law();
        court1.type();
        court1.rating();

        System.out.println("--------------------------------");

        Lawyer lawyer = new Lawyer();
        lawyer.judge();
        lawyer.rules();
        lawyer.law();
        lawyer.type();
        lawyer.rating();
        System.out.println("--------------------------------");

        Lawyer lawyer1= new Lawyer();
        lawyer1.judge();
        lawyer1.rules();
        lawyer1.law();
        lawyer1.type();
        lawyer1.rating();

        System.out.println("--------------------------------");

        Lawyer lawyer2= new Lawyer();
        lawyer2.judge();
        lawyer2.rules();
        lawyer2.law();
        lawyer2.type();
        lawyer2.rating();

        System.out.println("--------------------------------");

        Lawyer lawyer3= new Lawyer();
        lawyer3.judge();
        lawyer3.rules();
        lawyer3.law();
        lawyer3.type();
        lawyer3.rating();

        System.out.println("--------------------------------");




    }
}
