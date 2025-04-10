package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.School;

public class SchoolRun {
    public static void main(String[] args) {
        School school = new School("Sample", 456, true);
        System.out.println(school);
        System.out.println(school.hashCode());
        System.out.println("Original:"+System.identityHashCode(school));
        System.out.println("-------------------------");
    }
}
