package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Sea;
import com.xworkz.Inheritence.internal.Arabian;

public class SeaRunner {
    public static void main(String[] args) {
        Sea sea = new Sea();
        sea.type();
        sea.run();
        sea.swim();
        sea.tree();
        sea.weather();

        Sea sea1 = new Arabian();
        sea1.type();
        sea1.run();
        sea1.swim();
        sea1.tree();
        sea1.weather();
    }
}