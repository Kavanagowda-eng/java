package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.WashingMachine;

public class WashingMachineRun {
    public static void main(String[] args) {
        WashingMachine washingmachine = new WashingMachine("Sample", 456, true);
        System.out.println(washingmachine);
        System.out.println(washingmachine.hashCode());
        System.out.println("Original:"+System.identityHashCode(washingmachine));
        System.out.println("-------------------------");
    }
}
