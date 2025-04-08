package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Box;

public class CardboardBox extends Box {
        public CardboardBox() {
            super();
            System.out.println("CardboardBox is a subclass");
}

    @Override
    public void checkSize() {
        super.checkSize();
    }

    @Override
    public void closeBox() {
        super.closeBox();
    }

    @Override
    public void moveBox() {
        super.moveBox();
    }

    @Override
    public void openBox() {
        super.openBox();
    }

    @Override
    public void storeItems() {
        super.storeItems();
    }
    public void color() {
        System.out.println("color of the Cardbox");
    }
}

