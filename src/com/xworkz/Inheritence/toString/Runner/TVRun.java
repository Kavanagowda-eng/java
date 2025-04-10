package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.TV;

public class TVRun {
    public static void main(String[] args) {
        TV tv = new TV("Sample", 456, true);
        System.out.println(tv);
        System.out.println(tv.hashCode());
        System.out.println("Original:"+System.identityHashCode(tv));
        System.out.println("-------------------------");
    }
}
