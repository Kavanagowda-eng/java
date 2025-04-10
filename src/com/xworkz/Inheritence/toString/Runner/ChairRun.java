package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Chair;

public class ChairRun {
    public  static void main(String[]args){
        Chair chair = new Chair("Wood", 4, true);
        System.out.println(chair);
        System.out.println(chair.hashCode());
        System.out.println("Original:"+System.identityHashCode(chair));
        System.out.println("-------------------------");
    }
}
