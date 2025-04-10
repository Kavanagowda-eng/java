package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.Window;

public class WindowRun {
    public static void main(String[] args) {
        Window window = new Window("Sample", 456, true);
        System.out.println(window);
        System.out.println(window.hashCode());
        System.out.println("Original:"+System.identityHashCode(window));
        System.out.println("-------------------------");
    }
}

