package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Drone;

public class DroneRun {
    public static void main(String[] args) {
        Drone drone = new Drone("Sample", 456, true);
        System.out.println(drone);
        System.out.println(drone.hashCode());
        System.out.println("Original:"+System.identityHashCode(drone));
        System.out.println("-------------------------");
    }

}
