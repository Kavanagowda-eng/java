package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Watch;

public class WatchRun {
    public static void main(String[] args) {
        Watch watch = new Watch("Sample", 456, true);
        System.out.println(watch);
        System.out.println(watch.hashCode());
        System.out.println("Original:"+System.identityHashCode(watch));
        System.out.println("-------------------------");
    }

}
