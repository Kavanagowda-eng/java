package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Park;

public class ParkRun {
    public static void main(String[] args) {
        Park park = new Park("Sample", 456, true);
        System.out.println(park);
        System.out.println(park.hashCode());
        System.out.println("Original:"+System.identityHashCode(park));
        System.out.println("-------------------------");
    }
}
