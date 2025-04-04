package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Watch;
import com.xworkz.Inheritence.internal.Rolex;

public class WatchRunner {
    public static void main(String[]args){
        Watch watch=new Watch();
        watch.type();
        watch.battery();
        watch.show();
        watch.color();
        watch.wear();

        System.out.println("--------------------------------");

        Watch watch1=new Rolex();
        watch1.type();
        watch1.battery();
        watch1.show();
        watch1.color();
        watch1.wear();

        System.out.println("--------------------------------");

        Rolex rolex=new Rolex();
        rolex.type();
        rolex.battery();
        rolex.show();
        rolex.color();
        rolex.wear();

        System.out.println("--------------------------------");
    }
}
