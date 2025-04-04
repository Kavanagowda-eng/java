package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Shoes;
import com.xworkz.Inheritence.internal.Puma;

public class ShoesRunner {
    public static void main (String[]args){
        Shoes shoes1=new Puma();
        shoes1.wear();
        shoes1.buy();
        shoes1.sell();
        shoes1.wash();
        shoes1.Carry();

        System.out.println("--------------------------------");

        Puma puma=new Puma();
        puma.wear();
        puma.buy();
        puma.sell();
        puma.wash();
        puma.Carry();

        System.out.println("--------------------------------");
    }
}
