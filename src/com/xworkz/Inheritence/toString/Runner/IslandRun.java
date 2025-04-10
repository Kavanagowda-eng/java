package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Island;

public class IslandRun {
    public static void main(String[] args) {
        Island island = new Island("Sample", 456, true);
        System.out.println(island);
        System.out.println(island.hashCode());
        System.out.println("Original:"+System.identityHashCode(island));
        System.out.println("-------------------------");
    }
}
