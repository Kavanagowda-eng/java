package com.xworkz.Inheritence.internal;
import com.xworkz.Inheritence.External.Tshirt;

public class Casual extends Tshirt {
    public Casual ()
    {
        super();
        System.out.println("No args const in Casual");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void color() {
        super.color();
    }

    @Override
    public void design() {
        super.design();
    }

    @Override
    public void show() {
        super.show();
    }
    public void length() {
        System.out.println("length of the t shirt");
    }
}
