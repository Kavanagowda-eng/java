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

        Charger charger1=new Cpin();
        charger1.connection();
        charger1.socket();
        charger1.phone();
        charger1.wire();
        charger1.current();

        System.out.println("--------------------------------");

        Cpin cpin=new Cpin();
        cpin.connection();
        cpin.socket();
        cpin.phone();
        cpin.wire();
        cpin.current();

        System.out.println("--------------------------------");
    }
}
