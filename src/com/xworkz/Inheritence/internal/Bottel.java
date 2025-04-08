package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Container;

public class Bottel extends Container {

    public Bottel(){
        super();
        System.out.println("no-argu const is running");
    }

    @Override
    public void color() {
        super.color();
    }

    @Override
    public void capacity() {
        super.capacity();
    }

    @Override
    public void empty() {
        super.empty();
    }

    @Override
    public void fill() {
        super.fill();
    }

    @Override
    public void size() {
        super.size();
    }
    public void shape() {
        System.out.println("shape of the container");
    }
}



