package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Door;

public class DoorRun {
    public static void main(String[] args) {
        Door door = new Door("Sample", 456, true);
        System.out.println(door);
        System.out.println(door.hashCode());
        System.out.println("Original:"+System.identityHashCode(door));
        System.out.println("-------------------------");
    }

}
