package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Mobile;

public class MobileRun {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Sample", 456, true);
        System.out.println(mobile);
        System.out.println(mobile.hashCode());
        System.out.println("Original:"+System.identityHashCode(mobile));
        System.out.println("-------------------------");
    }
}

