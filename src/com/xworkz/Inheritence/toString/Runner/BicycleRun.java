package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.Bicycle;

public class BicycleRun {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Trek", 1, true);
        System.out.println(bicycle);
        System.out.println(bicycle.hashCode());
        System.out.println("Original:"+System.identityHashCode(bicycle));
        System.out.println("-------------------------");
    }
}
