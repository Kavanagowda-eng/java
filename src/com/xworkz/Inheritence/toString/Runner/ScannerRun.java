package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Scanner;

public class ScannerRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Sample", 456, true);
        System.out.println(scanner);
        System.out.println(scanner.hashCode());
        System.out.println("Original:"+System.identityHashCode(scanner));
        System.out.println("-------------------------");
    }
}
