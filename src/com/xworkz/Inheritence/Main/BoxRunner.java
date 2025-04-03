package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.internal.CardboardBox;
import com.xworkz.Inheritence.External.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box box = new Box();
        box.openBox();
        box.closeBox();
        box.storeItems();
        box.checkSize();
        box.moveBox();

        Box box1 = new CardboardBox();
        box1.openBox();
        box1.closeBox();
        box1.storeItems();
        box1.checkSize();
        box1.moveBox();

        Box box2 = new CardboardBox();
        box2.openBox();
        box2.closeBox();
        box2.storeItems();
        box2.checkSize();
        box2.moveBox();

        Box box3 = new CardboardBox();
        box3.openBox();
        box3.closeBox();
        box3.storeItems();
        box3.checkSize();
        box3.moveBox();
    }
}




