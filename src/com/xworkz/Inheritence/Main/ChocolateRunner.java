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

        DairyMilk dairyMilk1=new DairyMilk();
        dairyMilk1.eat();
        dairyMilk1.share();
        dairyMilk1.purchase();
        dairyMilk1.wrapper();
        dairyMilk1.flavor();

        System.out.println("--------------------------------");

        DairyMilk dairyMilk2=new DairyMilk();
        dairyMilk2.eat();
        dairyMilk2.share();
        dairyMilk2.purchase();
        dairyMilk2.wrapper();
        dairyMilk2.flavor();

        System.out.println("--------------------------------");

        DairyMilk dairyMilk3=new DairyMilk();
        dairyMilk3.eat();
        dairyMilk3.share();
        dairyMilk3.purchase();
        dairyMilk3.wrapper();
        dairyMilk3.flavor();

        System.out.println("--------------------------------");
    }
}
