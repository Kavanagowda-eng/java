package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.Bathroom;

public class BathroomRun {
    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom("Yes", 15, true);
        System.out.println(bathroom);
        System.out.println(bathroom.hashCode());
        System.out.println("Original:"+System.identityHashCode(bathroom));
        System.out.println("-------------------------");
    }
}

