package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Gym;

public class GymRun {
    public static void main(String[] args) {
        Gym gym = new Gym("Sample", 456, true);
        System.out.println(gym);
        System.out.println(gym.hashCode());
        System.out.println("Original:"+System.identityHashCode(gym));
        System.out.println("-------------------------");
    }
}
