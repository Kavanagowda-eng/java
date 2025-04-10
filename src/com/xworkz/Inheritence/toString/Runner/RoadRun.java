package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Road;

public class RoadRun {
    public static void main(String[] args) {
        Road road = new Road("Sample", 456, true);
        System.out.println(road);
        System.out.println(road.hashCode());
        System.out.println("Original:"+System.identityHashCode(road));
        System.out.println("-------------------------");
    }
}
