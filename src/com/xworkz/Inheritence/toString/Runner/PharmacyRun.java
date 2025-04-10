package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pharmacy;

public class PharmacyRun {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy("Sample", 456, true);
        System.out.println(pharmacy);
        System.out.println(pharmacy.hashCode());
        System.out.println("Original:"+System.identityHashCode(pharmacy));
        System.out.println("-------------------------");
    }

}
