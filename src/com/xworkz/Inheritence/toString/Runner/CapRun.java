package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.Cap;

public class CapRun {
    public static void main(String[] args) {
        Cap cap = new Cap("Adidas", 58, true);
        System.out.println(cap);
        System.out.println(cap.hashCode());
        System.out.println("Original:"+System.identityHashCode(cap));
        System.out.println("-------------------------");

    }
}
