package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Cafe;

public class CafeRun {
    public static void main(String[]args){
        Cafe cafe = new Cafe("Coffee", 20, true);
        System.out.println(cafe);
        System.out.println(cafe.hashCode());
        System.out.println("Original:"+System.identityHashCode(cafe));
        System.out.println("-------------------------");
    }
}
