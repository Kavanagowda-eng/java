package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Mirror;

public class MirrorRun {
    public static void main(String[] args) {
        Mirror mirror = new Mirror("Sample", 456, true);
        System.out.println(mirror);
        System.out.println(mirror.hashCode());
        System.out.println("Original:"+System.identityHashCode(mirror));
        System.out.println("-------------------------");
    }
}

