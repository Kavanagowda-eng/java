package com.xworkz.Inheritence.internal;
import com.xworkz.Inheritence.External.Bracelet;

public class Cartier extends Bracelet {
    public Cartier (){
        super();
        System.out.println("No args const in cartier");
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
    public void wear() {
        super.wear();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void design() {
        super.design();
    }
    public void metal () {
        System.out.println("metal of the blaclet");
    }
}
