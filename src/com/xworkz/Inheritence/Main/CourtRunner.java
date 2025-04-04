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
    }
}
