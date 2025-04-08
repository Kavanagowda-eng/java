package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Hair;
import com.xworkz.Inheritence.internal.Wig;

public class HairRunner {
    public static void main (String[]args){
        Hair hair=new Hair();
        hair.type();
        hair.curl();
        hair.straight();
        hair.color();
        hair.style();

        System.out.println("--------------------------------");

        Hair hair1=new Wig();
        hair1.type();
        hair1.curl();
        hair1.straight();
        hair1.color();
        hair1.style();

        System.out.println("--------------------------------");

        Wig wig=new Wig();
        wig.type();
        wig.curl();
        wig.straight();
        wig.color();
        wig.style();

        System.out.println("--------------------------------");

        Wig wig1=new Wig();
        wig1.type();
        wig1.curl();
        wig1.straight();
        wig1.color();
        wig1.style();

        System.out.println("--------------------------------");

    }
}
