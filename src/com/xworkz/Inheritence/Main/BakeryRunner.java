package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Bakery;
import com.xworkz.Inheritence.External.Center;
import com.xworkz.Inheritence.internal.Jalebi;
import com.xworkz.Inheritence.internal.Training;

public class BakeryRunner {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.type();
        bakery.location();
        bakery.place();
        bakery.sweets();
        bakery.visit();

        System.out.println("--------------------------------");

        Bakery bakery1 = new Jalebi();
        bakery1.type();
        bakery1.location();
        bakery1.place();
        bakery1.sweets();
        bakery1.visit();

        System.out.println("--------------------------------");

        Jalebi jalebi = new Jalebi();
        jalebi.type();
        jalebi.location();
        jalebi.place();
        jalebi.sweets();
        jalebi.visit();

        System.out.println("--------------------------------");

        Center center = new Center();
        center.type();
        center.location();
        center.place();
        center.books();
        center.visit();

        System.out.println("--------------------------------");

        Center center1 = new Training();
        center1.type();
        center1.location();
        center1.place();
        center1.books();
        center1.visit();

        System.out.println("--------------------------------");
    }
}
