package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Bus;

public class BusRun {
    public static void main(String[] args) {
        Bus bus = new Bus("Volvo", 50, false);
        System.out.println(bus);
        System.out.println(bus.hashCode());
        System.out.println("Original:"+System.identityHashCode(bus));
        System.out.println("-------------------------");
    }
}