package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.MilkShake;
import com.xworkz.Inheritence.internal.KitKat;

public class MilkShakeRunner {
    public static void main(String[]args){
        MilkShake milkShake=new MilkShake();
        milkShake.type();
        milkShake.drink();
        milkShake.taste();
        milkShake.color();
        milkShake.flavor();

        System.out.println("--------------------------------");

        MilkShake milkShake1=new MilkShake();
        milkShake1.type();
        milkShake1.drink();
        milkShake1.taste();
        milkShake1.color();
        milkShake1.flavor();

        System.out.println("--------------------------------");

        KitKat kitKat=new KitKat();
        kitKat.type();
        kitKat.drink();
        kitKat.taste();
        kitKat.color();
        kitKat.flavor();

        System.out.println("--------------------------------");
    }
}
