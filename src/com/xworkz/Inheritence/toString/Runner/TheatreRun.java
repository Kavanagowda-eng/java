package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Theatre;

public class TheatreRun {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Sample", 456, true);
        System.out.println(theatre);
        System.out.println(theatre.hashCode());
        System.out.println("Original:"+System.identityHashCode(theatre));
        System.out.println("-------------------------");
    }
}
