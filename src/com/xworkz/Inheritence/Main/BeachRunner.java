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
    }


    }
