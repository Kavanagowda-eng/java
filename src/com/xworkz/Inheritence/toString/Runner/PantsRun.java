package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pants;

public class PantsRun {
    public static void main(String[] args) {
        Pants pants = new Pants("Sample", 456, true);
        System.out.println(pants);
        System.out.println(pants.hashCode());
        System.out.println("Original:"+System.identityHashCode(pants));
        System.out.println("-------------------------");
    }
}
