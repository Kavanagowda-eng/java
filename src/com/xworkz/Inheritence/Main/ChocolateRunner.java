package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Chocolate;
import com.xworkz.Inheritence.internal.DairyMilk;

public class ChocolateRunner {
    public static void main (String[]args){
        Chocolate chocolate1=new Chocolate();
        chocolate1.eat();
        chocolate1.share();
        chocolate1.purchase();
        chocolate1.wrapper();
        chocolate1.flavor();

        System.out.println("--------------------------------");

        DairyMilk dairyMilk=new DairyMilk();
        dairyMilk.eat();
        dairyMilk.share();
        dairyMilk.purchase();
        dairyMilk.wrapper();
        dairyMilk.flavor();

        System.out.println("--------------------------------");
    }
}
