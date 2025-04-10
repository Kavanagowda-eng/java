package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Helmet;

public class HelmetRun {
    public static void main(String[] args) {
        Helmet helmet = new Helmet("Sample", 456, true);
        System.out.println(helmet);
        System.out.println(helmet.hashCode());
        System.out.println("Original:"+System.identityHashCode(helmet));
        System.out.println("-------------------------");
    }
}
