package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Socks;

public class SocksRun {
    public static void main(String[] args) {
        Socks socks = new Socks("Sample", 456, true);
        System.out.println(socks);
        System.out.println(socks.hashCode());
        System.out.println("Original:"+System.identityHashCode(socks));
        System.out.println("-------------------------");
    }
}
