package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Stadium;

public class StadiumRun {
    public static void main(String[] args) {
        Stadium stadium = new Stadium("Sample", 456, true);
        System.out.println(stadium);
        System.out.println(stadium.hashCode());
        System.out.println("Original:"+System.identityHashCode(stadium));
        System.out.println("-------------------------");
    }
}
