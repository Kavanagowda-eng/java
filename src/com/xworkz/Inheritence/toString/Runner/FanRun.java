package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Fan;

public class FanRun {
    public static void main(String[] args) {
        Fan fan = new Fan("Sample", 456, true);
        System.out.println(fan);
        System.out.println(fan.hashCode());
        System.out.println("Original:"+System.identityHashCode(fan));
        System.out.println("-------------------------");
    }
}
