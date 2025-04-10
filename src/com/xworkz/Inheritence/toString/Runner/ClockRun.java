package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Clock;

public class ClockRun {
    public static void main(String[]args){
        Clock clock = new Clock("Wall Clock", 1, true);
        System.out.println(clock);
        System.out.println(clock.hashCode());
        System.out.println("Original:"+System.identityHashCode(clock));
        System.out.println("-------------------------");
    }
}
