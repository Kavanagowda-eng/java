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

        Jalebi jalebi1 = new Jalebi();
        jalebi1.type();
        jalebi1.location();
        jalebi1.place();
        jalebi1.sweets();
        jalebi1.visit();
        System.out.println("--------------------------------");

        Jalebi jalebi2 = new Jalebi();
        jalebi2.type();
        jalebi2.location();
        jalebi2.place();
        jalebi2.sweets();
        jalebi2.visit();
        System.out.println("--------------------------------");

        Jalebi jalebi3 = new Jalebi();
        jalebi3.type();
        jalebi3.location();
        jalebi3.place();
        jalebi3.sweets();
        jalebi3.visit();
        System.out.println("--------------------------------");




    }
}
