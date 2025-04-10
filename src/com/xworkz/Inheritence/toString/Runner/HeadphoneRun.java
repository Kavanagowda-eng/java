package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Headphone;

public class HeadphoneRun {
    public static void main(String[] args) {
        Headphone headphone = new Headphone("Sample", 456, true);
        System.out.println(headphone);
        System.out.println(headphone.hashCode());
        System.out.println("Original:"+System.identityHashCode(headphone));
        System.out.println("-------------------------");
    }

}
