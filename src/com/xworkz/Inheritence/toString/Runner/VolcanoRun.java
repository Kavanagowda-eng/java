package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Volcano;

public class VolcanoRun {
    public static void main(String[] args) {
        Volcano volcano = new Volcano("Sample", 456, true);
        System.out.println(volcano);
        System.out.println(volcano.hashCode());
        System.out.println("Original:"+System.identityHashCode(volcano));
        System.out.println("-------------------------");
    }

}
