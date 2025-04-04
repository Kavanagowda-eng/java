package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.IceCream;
import com.xworkz.Inheritence.internal.Amul;

public class IceCreamRunner {
    public static void main(String[]args){
        IceCream iceCream=new IceCream();
        iceCream.scoop();
        iceCream.flavor();
        iceCream.eatScoop();
        iceCream.select();
        iceCream.priceOf();

        System.out.println("------------------------");

        IceCream iceCream1=new Amul();
        iceCream1.scoop();
        iceCream1.flavor();
        iceCream1.eatScoop();
        iceCream1.select();
        iceCream1.priceOf();

        System.out.println("------------------------");
    }
}
