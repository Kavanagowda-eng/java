package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Bar;

public class BarRun {
        public static void main(String[] args) {

            Bar bar = new Bar("Cocktails", 1, true);
            System.out.println(bar);
            System.out.println(bar.hashCode());
            System.out.println("Original:"+System.identityHashCode(bar));
            System.out.println("-------------------------");
        }
}


