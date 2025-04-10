package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Lab;

public class LabRun {
    public static void main(String[] args) {
        Lab lab = new Lab("Sample", 456, true);
        System.out.println(lab);
        System.out.println(lab.hashCode());
        System.out.println("Original:"+System.identityHashCode(lab));
        System.out.println("-------------------------");
    }
}
