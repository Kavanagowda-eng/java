package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Bottle;

public class BottleRun {
    public static void main(String[]args){
        Bottle bottle = new Bottle("Plastic", 500, true);
        System.out.println(bottle);
        System.out.println(bottle.hashCode());
        System.out.println("Original:"+System.identityHashCode(bottle));
        System.out.println("-------------------------");
    }
}
