package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Clothes;
import com.xworkz.Inheritence.External.Pant;


public class ClothesRunner {
    public static void main(String[] args) {
        Clothes clothes = new Clothes();
        clothes.purchase();
        clothes.sell();
        clothes.wear();
        clothes.wash();
        clothes.trial();

        System.out.println("------------------------");



    }
}

