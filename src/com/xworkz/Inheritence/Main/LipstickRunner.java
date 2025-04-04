package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Lipstick;
import com.xworkz.Inheritence.internal.Dior;

public class LipstickRunner {
    public static void main(String[]args) {
        Lipstick lipstick = new Lipstick();
        lipstick.type();
        lipstick.duration();
        lipstick.brand();
        lipstick.color();
        lipstick.quality();

        System.out.println("--------------------------------");

        Lipstick lipstick1 = new Dior();
        lipstick1.type();
        lipstick1.duration();
        lipstick1.brand();
        lipstick1.color();
        lipstick1.quality();

        System.out.println("--------------------------------");

        Dior dior = new Dior();
        dior.type();
        dior.duration();
        dior.brand();
        dior.color();
        dior.quality();

        System.out.println("--------------------------------");

    }
}
