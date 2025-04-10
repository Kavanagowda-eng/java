package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pharmacy;
import com.xworkz.Inheritence.ToString1.Student;

public class StudentRun {
    public static void main(String[] args) {
        Student student = new Student("Sample", 456, true);
        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println("Original:" + System.identityHashCode(student));
        System.out.println("-------------------------");
    }
}
