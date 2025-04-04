package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Gate;
import com.xworkz.Inheritence.internal.Steel;

public class Gaterunner {
    public static void main(String[]args){
        Gate gate=new Gate();
        gate.type();
        gate.design();
        gate.wash();
        gate.color();
        gate.put();

        System.out.println("--------------------------------");

        Gate gate1=new Steel();
        gate1.type();
        gate1.design();
        gate1.wash();
        gate1.color();
        gate1.put();

        System.out.println("--------------------------------");

        Steel steel=new Steel();
        steel.type();
        steel.design();
        steel.wash();
        steel.color();
        steel.put();

        System.out.println("--------------------------------");
    }
}
