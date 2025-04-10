package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Lake;

public class LakeRun {
    public static void main(String[] args) {
        Lake lake = new Lake("Sample", 456, true);
        System.out.println(lake);
        System.out.println(lake.hashCode());
        System.out.println("Original:"+System.identityHashCode(lake));
        System.out.println("-------------------------");
    }

}
