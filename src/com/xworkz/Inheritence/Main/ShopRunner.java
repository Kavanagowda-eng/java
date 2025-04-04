package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Shop;
import com.xworkz.Inheritence.internal.Ration;

public class ShopRunner {
    public static void main(String []args){
        Shop shop=new Shop();
        shop.type();
        shop.location();
        shop.place();
        shop.things();
        shop.visit();

        System.out.println("--------------------------------");

        Shop shop1=new Ration();
        shop1.type();
        shop1.location();
        shop1.place();
        shop1.things();
        shop1.visit();

        System.out.println("--------------------------------");

        Ration ration=new Ration();
        ration.type();
        ration.location();
        ration.place();
        ration.things();
        ration.visit();

        System.out.println("--------------------------------");
    }
}
