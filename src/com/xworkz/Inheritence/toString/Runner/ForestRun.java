package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Forest;

public class ForestRun {
    public static void main(String[] args) {
        Forest forest = new Forest("Sample", 456, true);
        System.out.println(forest);
        System.out.println(forest.hashCode());
        System.out.println("Original:"+System.identityHashCode(forest));
        System.out.println("-------------------------");
    }
}
