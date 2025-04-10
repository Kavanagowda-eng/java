package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Glove;

public class GloveRun {
    public static void main(String[] args) {
        Glove glove = new Glove("Sample", 456, true);
        System.out.println(glove);
        System.out.println(glove.hashCode());
        System.out.println("Original:"+System.identityHashCode(glove));
        System.out.println("-------------------------");
    }

}
