package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.AirConditioner;

public class AirConditionerRun {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner("Samsung", 2, true);
        System.out.println(airConditioner);
        System.out.println(airConditioner.hashCode());
        System.out.println("Original:" + System.identityHashCode(airConditioner));
        System.out.println("-------------------------");
    }
}
