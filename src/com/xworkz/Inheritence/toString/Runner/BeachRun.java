package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Beach;

public class BeachRun {
    public static void main(String[] args) {
        Beach beach = new Beach("Sandy", 500, true);
        System.out.println(beach);
        System.out.println(beach.hashCode());
        System.out.println("Original:"+System.identityHashCode(beach));
        System.out.println("-------------------------");
    }
}
