package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Motorcycle;

public class MotorcycleRun {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Sample", 456, true);
        System.out.println(motorcycle);
        System.out.println(motorcycle.hashCode());
        System.out.println("Original:"+System.identityHashCode(motorcycle));
        System.out.println("-------------------------");
    }

}
