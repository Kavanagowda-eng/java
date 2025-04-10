package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pen;
import com.xworkz.Inheritence.ToString1.Table;

public class TableRun {
    public static void main(String[] args) {
        Table table = new Table("Sample", 456, true);
        System.out.println(table);
        System.out.println(table.hashCode());
        System.out.println("Original:"+System.identityHashCode(table));
        System.out.println("-------------------------");
    }

}
