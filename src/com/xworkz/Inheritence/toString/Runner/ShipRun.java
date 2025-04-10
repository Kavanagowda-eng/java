package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Ship;

public class ShipRun {
    public static void main(String[] args) {
        Ship ship = new Ship("Sample", 456, true);
        System.out.println(ship);
        System.out.println(ship.hashCode());
        System.out.println("Original:"+System.identityHashCode(ship));
        System.out.println("-------------------------");
    }
}
