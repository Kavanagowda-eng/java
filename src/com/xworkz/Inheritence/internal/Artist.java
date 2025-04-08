package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Art;

public class Artist extends Art {
    public Artist(){
        super();
        System.out.println("No args constructor in Artist");
    }

    @Override
    public void buy() {
        super.buy();
    }

    @Override
    public void create() {
        super.create();
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void sell() {
        super.sell();
    }

    @Override
    public void frame() {
        super.frame();
    }
    public void color(){
        System.out.println("color the art");
    }
}
