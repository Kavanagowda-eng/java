package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Bridge;

public class BridgeRun {
    public static void main(String[] args) {
        Bridge bridge = new Bridge("500 meters", 2, true);
        System.out.println(bridge);
        System.out.println(bridge.hashCode());
        System.out.println("Original:"+System.identityHashCode(bridge));
        System.out.println("-------------------------");

    }
}
