package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Mall;

public class MallRun {
    public static void main(String[] args) {
        Mall mall = new Mall("Sample", 456, true);
        System.out.println(mall);
        System.out.println(mall.hashCode());
        System.out.println("Original:"+System.identityHashCode(mall));
        System.out.println("-------------------------");
    }
}
