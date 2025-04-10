package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Train;

public class TrainRun {
    public static void main(String[] args) {
        Train train = new Train("Sample", 456, true);
        System.out.println(train);
        System.out.println(train.hashCode());
        System.out.println("Original:"+System.identityHashCode(train));
        System.out.println("-------------------------");
    }
}
