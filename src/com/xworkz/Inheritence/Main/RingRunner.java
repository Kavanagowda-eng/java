package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Ring;
import com.xworkz.Inheritence.internal.Diamond;

public class RingRunner {
    public static void main(String[]args){
        Ring ring=new Ring();
        ring.wear();
        ring.design();
        ring.wash();
        ring.color();
        ring.buy();

        System.out.println("--------------------------------");

        Ring ring1=new Diamond();
        ring1.wear();
        ring1.design();
        ring1.wash();
        ring1.color();
        ring1.buy();

        System.out.println("--------------------------------");

        Diamond diamond=new Diamond();
        diamond.wear();
        diamond.design();
        diamond.wash();
        diamond.color();
        diamond.buy();

        System.out.println("--------------------------------");
    }
}
