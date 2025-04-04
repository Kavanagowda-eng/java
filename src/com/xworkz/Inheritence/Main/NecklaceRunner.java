package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Necklace;
import com.xworkz.Inheritence.internal.Gold;

public class NecklaceRunner {
    public static void main(String[]args){
        Necklace necklace=new Necklace();
        necklace.wear();
        necklace.design();
        necklace.wash();
        necklace.color();
        necklace.buy();

        System.out.println("--------------------------------");

        Necklace necklace1=new Gold();
        necklace1.wear();
        necklace1.design();
        necklace1.wash();
        necklace1.color();
        necklace1.buy();

        System.out.println("--------------------------------");

        Gold gold=new Gold();
        gold.wear();
        gold.design();
        gold.wash();
        gold.color();
        gold.buy();

        System.out.println("--------------------------------");
    }
}
