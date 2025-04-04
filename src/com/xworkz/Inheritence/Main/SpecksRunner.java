package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Specks;
import com.xworkz.Inheritence.internal.LensKart;

public class SpecksRunner {
    public static void main(String[]args) {
        Specks specks1 = new Specks();
        specks1.type();
        specks1.duration();
        specks1.lens();
        specks1.color();
        specks1.quality();

        System.out.println("--------------------------------");

        Specks specks2 = new Specks();
       specks2.type();
        specks2.duration();
       specks2.lens();
        specks2.color();
        specks2.quality();

        System.out.println("--------------------------------");
    }
    }

