package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Lamp;

public class LampRun {
    public static void main(String[] args) {
        Lamp lamp = new Lamp("Sample", 456, true);
        System.out.println(lamp);
        System.out.println(lamp.hashCode());
        System.out.println("Original:"+System.identityHashCode(lamp));
        System.out.println("-------------------------");
    }

}
