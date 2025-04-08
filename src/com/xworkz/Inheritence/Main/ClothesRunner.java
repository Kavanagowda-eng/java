package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Clothes;
import com.xworkz.Inheritence.internal.Pant;

public class ClothesRunner {
    public static void main(String[] args) {
        Clothes clothes = new Clothes();
        clothes.purchase();
        clothes.sell();
        clothes.wear();
        clothes.wash();
        clothes.trial();

        System.out.println("------------------------");

        Clothes clothes1= new Pant();
        clothes1.purchase();
        clothes1.sell();
        clothes1.wear();
        clothes1.wash();
        clothes1.trial();

        System.out.println("------------------------");

        Clothes clothes2= new Pant();
        clothes2.purchase();
        clothes2.sell();
        clothes2.wear();
        clothes2.wash();
        clothes2.trial();

        System.out.println("------------------------");

        Clothes clothes3= new Pant();
        clothes3.purchase();
        clothes3.sell();
        clothes3.wear();
        clothes3.wash();
        clothes3.trial();

        System.out.println("------------------------");
    }
}

