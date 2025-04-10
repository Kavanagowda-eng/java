package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Keyboard;

public class KeyBoardRun {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Sample", 456, true);
        System.out.println(keyboard);
        System.out.println(keyboard.hashCode());
        System.out.println("Original:"+System.identityHashCode(keyboard));
        System.out.println("-------------------------");
    }
}
