package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Printer;

public class PrinterRun {
    public static void main(String[] args) {
        Printer printer = new Printer("Sample", 456, true);
        System.out.println(printer);
        System.out.println(printer.hashCode());
        System.out.println("Original:"+System.identityHashCode(printer));
        System.out.println("-------------------------");
    }
}
