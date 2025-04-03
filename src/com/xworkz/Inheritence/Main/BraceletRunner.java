package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Bracelet;
import com.xworkz.Inheritence.internal.Cartier;

public class BraceletRunner {
    public static void main(String[] args) {
        Bracelet bracelet1 = new Bracelet();
        bracelet1.type();
        bracelet1.design();
        bracelet1.show();
        bracelet1.color();
        bracelet1.wear();

        Bracelet bracelet2 = new Cartier();
        bracelet2.type();
        bracelet2.design();
        bracelet2.show();
        bracelet2.color();
        bracelet2.wear();
    }
}
