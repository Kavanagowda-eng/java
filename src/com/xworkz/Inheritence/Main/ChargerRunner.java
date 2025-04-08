package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Charger;
import com.xworkz.Inheritence.internal.Cpin;

public class ChargerRunner {
    public static void main (String[]args){
        Charger charger=new Charger();
        charger.connection();
        charger.socket();
        charger.phone();
        charger.wire();
        charger.current();

        System.out.println("--------------------------------");

        Charger charger1=new Charger();
        charger1.connection();
        charger1.socket();
        charger1.phone();
        charger1.wire();
        charger1.current();

        System.out.println("--------------------------------");

        Charger charger2=new Cpin();
        charger2.connection();
        charger2.socket();
        charger2.phone();
        charger2.wire();
        charger2.current();

        System.out.println("--------------------------------");

        Charger charger3=new Cpin();
        charger3.connection();
        charger3.socket();
        charger3.phone();
        charger3.wire();
        charger3.current();

        System.out.println("--------------------------------");


    }
}
