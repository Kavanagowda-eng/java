package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Cushion;

public class CushionRun {
    public static void main(String[]args){
        Cushion cushion = new Cushion("Blue", 30, true);
        System.out.println(cushion);
        System.out.println(cushion.hashCode());
        System.out.println("Original:"+System.identityHashCode(cushion));
        System.out.println("-------------------------");
    }
}
