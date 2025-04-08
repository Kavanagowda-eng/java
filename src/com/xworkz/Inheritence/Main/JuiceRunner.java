package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Juice;
import com.xworkz.Inheritence.internal.Mango;

public class JuiceRunner {
    public static void main(String[] args) {
        Juice juice = new Juice();
        juice.drink();
        juice.buy();
        juice.glass();
        juice.packet();
        juice.pour();
        System.out.println("--------------------------------");

            Juice juice1 = new Mango();
            juice1.drink();
            juice1.buy();
            juice1.glass();
            juice1.packet();
            juice1.pour();
        System.out.println("--------------------------------");

            Juice juice2 = new Mango();
            juice2.drink();
            juice2.buy();
            juice2.glass();
            juice2.packet();
            juice2.pour();
        System.out.println("--------------------------------");
        }
    }
