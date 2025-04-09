package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pharmacy;
import com.xworkz.Inheritence.ToString1.Student;

public class StudentRun {
    public static void main(String[] args) {
        Student student = new Student("Sample", 456, true);
        System.out.println(student);
    }

    public static class PharmacyRun {
        public static void main(String[] args) {
            Pharmacy pharmacy = new Pharmacy("Sample", 456, true);
            System.out.println(pharmacy);
        }
    }
}
