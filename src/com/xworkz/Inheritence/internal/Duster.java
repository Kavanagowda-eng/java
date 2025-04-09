package com.xworkz.Inheritence.internal;
import com.xworkz.Inheritence.External.Board;

public class Duster extends Board {
    public Duster()
    {
        super();
        System.out.println("No args const in Duster");
    }

    @Override
    public void write() {
        super.write();
    }

    @Override
    public void clean() {
        super.clean();
    }

    @Override
    public void color() {
        super.color();
    }

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void chalk() {
        super.chalk();
    }
    public void type() {
        System.out.println("type of the board");
}}
