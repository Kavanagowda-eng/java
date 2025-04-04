package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.TV;
import com.xworkz.Inheritence.internal.Sony;

public class TVRunner {
    public static void main(String[]args) {
        TV tv = new TV();
        tv.watch();
        tv.sell();
        tv.buy();
        tv.brand();
        tv.price();

        System.out.println("------------------------------");

        TV tv1 = new Sony();
        tv1.watch();
        tv1.sell();
        tv1.buy();
        tv1.brand();
        tv1.price();

        System.out.println("------------------------");

        Sony sony = new Sony();
        sony.watch();
        sony.sell();
        sony.buy();
        sony.brand();
        sony.price();

        System.out.println("------------------------------");

        TV tv2 = new TV();
        tv2.watch();
        tv2.sell();
        tv2.buy();
        tv2.brand();
        tv2.price();

        System.out.println("------------------------");

    }
}
