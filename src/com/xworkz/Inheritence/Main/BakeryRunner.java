package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Bakery;
import com.xworkz.Inheritence.internal.Jalebi;



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

        Bakery bakery2 = new Jalebi();
        bakery2.type();
        bakery2.location();
        bakery2.place();
        bakery2.sweets();
        bakery2.visit();
        System.out.println("--------------------------------");

        Bakery bakery3 = new Jalebi();
        bakery3.type();
        bakery3.location();
        bakery3.place();
        bakery3.sweets();
        bakery3.visit();
        System.out.println("--------------------------------");

        Jalebi jalebi = new Jalebi();
        jalebi.type();
        jalebi.location();
        jalebi.place();
        jalebi.sweets();
        jalebi.visit();

        System.out.println("--------------------------------");

    }
}
