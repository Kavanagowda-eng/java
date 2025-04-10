package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Sunglasses;

public class SunglassesRun {
    public static void main(String[] args) {
        Sunglasses sunglasses = new Sunglasses("Sample", 456, true);
        System.out.println(sunglasses);
        System.out.println(sunglasses.hashCode());
        System.out.println("Original:"+System.identityHashCode(sunglasses));
        System.out.println("-------------------------");
    }
}
