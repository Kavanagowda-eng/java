package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pen;
import com.xworkz.Inheritence.ToString1.Table;

public class TableRun {
    public static void main(String[] args) {
        Table table = new Table("Sample", 456, true);
        System.out.println(table);
    }

    public static class PenRun {
        public static void main(String[] args) {
            Pen pen = new Pen("Sample", 456, true);
            System.out.println(pen);
        }
    }
}
