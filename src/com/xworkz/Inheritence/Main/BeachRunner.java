package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Beach;
import com.xworkz.Inheritence.internal.Island;

public class BeachRunner {
    public static void main(String[] args) {
        Beach beach = new Beach();
        beach.type();
        beach.run();
        beach.swim();
        beach.tree();
        beach.weather();
        System.out.println("--------------------------------");

        Beach beach1 = new Island();
        beach1.type();
        beach1.run();
        beach1.swim();
        beach1.tree();
        beach1.weather();

        System.out.println("--------------------------------");

        Beach beach2= new Island();
        beach2.type();
        beach2.run();
        beach2.swim();
        beach2.tree();
        beach2.weather();

        System.out.println("--------------------------------");

        Beach beach3 = new Island();
        beach3.type();
        beach3.run();
        beach3.swim();
        beach3.tree();
        beach3.weather();

        System.out.println("--------------------------------");

    }
    }
