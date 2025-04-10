package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pen;

public class PenRun {
    public static void main(String[] args) {
        Pen pen = new Pen("Sample", 456, true);
        System.out.println(pen);
        System.out.println(pen.hashCode());
        System.out.println("Original:"+System.identityHashCode(pen));
        System.out.println("-------------------------");
    }
}
