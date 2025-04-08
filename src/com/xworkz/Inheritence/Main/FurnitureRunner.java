package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Furniture;
import com.xworkz.Inheritence.internal.Chair;

public class FurnitureRunner {
    public static void main (String[]args) {
        Furniture furniture = new Chair();
        furniture.sleep();
        furniture.sit();
        furniture.tostore();
        furniture.design();
        furniture.showcase();
        System.out.println("------------------------");

        Furniture furniture1 = new Chair();
            furniture1.sleep();
            furniture1.sit();
            furniture1.tostore();
            furniture1.design();
            furniture1.showcase();

        Furniture furniture2 = new Chair();
        furniture2.sleep();
        furniture2.sit();
        furniture2.tostore();
        furniture2.design();
        furniture2.showcase();
        System.out.println("------------------------");

        Furniture furniture3= new Chair();
        furniture3.sleep();
        furniture3.sit();
        furniture3.tostore();
        furniture3.design();
        furniture3.showcase();
        System.out.println("------------------------");

    }
}
