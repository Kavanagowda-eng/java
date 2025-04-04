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


    }
}
