package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.River;

public class RiverRun {
    public static void main(String[] args) {
        River river = new River("Sample", 456, true);
        System.out.println(river);
        System.out.println(river.hashCode());
        System.out.println("Original:"+System.identityHashCode(river));
        System.out.println("-------------------------");
    }

}
