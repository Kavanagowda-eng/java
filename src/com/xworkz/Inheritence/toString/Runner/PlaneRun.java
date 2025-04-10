package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Plane;

public class PlaneRun {
    public static void main(String[] args) {
        Plane plane = new Plane("Sample", 456, true);
        System.out.println(plane);
        System.out.println(plane.hashCode());
        System.out.println("Original:"+System.identityHashCode(plane));
        System.out.println("-------------------------");
    }
    }


