package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Truck;

public class TruckRun {
    public static void main(String[] args) {
        Truck truck = new Truck("Sample", 456, true);
        System.out.println(truck);
        System.out.println(truck.hashCode());
        System.out.println("Original:"+System.identityHashCode(truck));
        System.out.println("-------------------------");
    }
    }
