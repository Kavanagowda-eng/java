package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Mountain;

public class MoutainRun {
    public static void main(String[] args) {
        Mountain mountain = new Mountain("Sample", 456, true);
        System.out.println(mountain);
        System.out.println(mountain.hashCode());
        System.out.println("Original:"+System.identityHashCode(mountain));
        System.out.println("-------------------------");
    }
    }

