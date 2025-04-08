package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Colddrink;
import com.xworkz.Inheritence.internal.CocaCola;

public class ColddrinkRunner {
    public static void main(String[]args){
        Colddrink colddrink=new Colddrink();
        colddrink.type();
        colddrink.design();
        colddrink.show();
        colddrink.color();
        colddrink.drink();

        System.out.println("--------------------------------");

        Colddrink colddrink1=new CocaCola();
        colddrink1.type();
        colddrink1.design();
        colddrink1.show();
        colddrink1.color();
        colddrink1.drink();

        System.out.println("--------------------------------");

        CocaCola cocaCola=new CocaCola();
        cocaCola.type();
        cocaCola.design();
        cocaCola.show();
        cocaCola.color();
        cocaCola.drink();

        System.out.println("--------------------------------");

        CocaCola cocaCola1=new CocaCola();
        cocaCola1.type();
        cocaCola1.design();
        cocaCola1.show();
        cocaCola1.color();
        cocaCola1.drink();

        System.out.println("--------------------------------");
    }
}
