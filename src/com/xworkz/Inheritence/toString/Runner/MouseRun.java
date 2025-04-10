package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Mouse;

public class MouseRun {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Sample", 456, true);
        System.out.println(mouse);
        System.out.println(mouse.hashCode());
        System.out.println("Original:"+System.identityHashCode(mouse));
        System.out.println("-------------------------");
    }
}
