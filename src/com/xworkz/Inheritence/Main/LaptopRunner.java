package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Laptop;
import com.xworkz.Inheritence.internal.Acer;

public class LaptopRunner {
    public static void main(String[]args){
        Laptop laptop=new Laptop();
        laptop.type();
        laptop.brand();
        laptop.storage();
        laptop.processor();
        laptop.display();

        System.out.println("------------------------");

        Laptop laptop4=new Acer();
        laptop4.type();
        laptop4.brand();
        laptop4.storage();
        laptop4.processor();
        laptop4.display();

        System.out.println("------------------------");

        Acer acer=new Acer();
        acer.type();
        acer.brand();
        acer.storage();
        acer.processor();
        acer.display();
    }
}


