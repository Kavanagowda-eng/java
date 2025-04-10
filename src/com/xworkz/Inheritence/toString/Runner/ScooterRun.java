package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Scooter;

public class ScooterRun {
    public static void main(String[] args) {
        Scooter scooter = new Scooter("Sample", 456, true);
        System.out.println(scooter);
        System.out.println(scooter.hashCode());
        System.out.println("Original:"+System.identityHashCode(scooter));
        System.out.println("-------------------------");
    }

}
