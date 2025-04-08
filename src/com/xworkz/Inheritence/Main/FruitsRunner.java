package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Fruits;
import com.xworkz.Inheritence.internal.Mango;

public class FruitsRunner {
    public static void main(String[]args) {
        Fruits fruits1 = new Fruits();
        fruits1.distribute();
        fruits1.buy();
        fruits1.sell();
        fruits1.eat();
        fruits1.cut();
        System.out.println("------------------------");

        Fruits fruits2= new Fruits();
        fruits2.distribute();
        fruits2.buy();
        fruits2.sell();
        fruits2.eat();
        fruits2.cut();
        System.out.println("------------------------");

        Fruits fruits3= new Fruits();
        fruits3.distribute();
        fruits3.buy();
        fruits3.sell();
        fruits3.eat();
        fruits3.cut();
        System.out.println("------------------------");


    }
}
