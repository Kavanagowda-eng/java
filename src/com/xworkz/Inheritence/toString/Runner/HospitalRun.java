package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Hospital;

public class HospitalRun {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Sample", 456, true);
        System.out.println(hospital);
        System.out.println(hospital.hashCode());
        System.out.println("Original:"+System.identityHashCode(hospital));
        System.out.println("-------------------------");
    }
}
