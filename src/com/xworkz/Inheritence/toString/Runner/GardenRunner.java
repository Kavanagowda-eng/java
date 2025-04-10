package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Garden;

public class GardenRunner {
    public static void main(String[] args) {
        Garden garden = new Garden("Sample", 456, true);
        System.out.println(garden);
        System.out.println(garden.hashCode());
        System.out.println("Original:"+System.identityHashCode(garden));
        System.out.println("-------------------------");
    }
}
