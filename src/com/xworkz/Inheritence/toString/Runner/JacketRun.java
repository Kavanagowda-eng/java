package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Jacket;

public class JacketRun {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("Sample", 456, true);
        System.out.println(jacket);
        System.out.println(jacket.hashCode());
        System.out.println("Original:"+System.identityHashCode(jacket));
        System.out.println("-------------------------");
    }
}
