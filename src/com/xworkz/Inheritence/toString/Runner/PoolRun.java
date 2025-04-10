package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pool;

public class PoolRun {
    public static void main(String[] args) {
        Pool pool = new Pool("Sample", 456, true);
        System.out.println(pool);
        System.out.println(pool.hashCode());
        System.out.println("Original:"+System.identityHashCode(pool));
        System.out.println("-------------------------");
    }

}
