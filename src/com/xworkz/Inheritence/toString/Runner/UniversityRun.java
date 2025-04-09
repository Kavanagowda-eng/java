package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Pharmacy;
import com.xworkz.Inheritence.ToString1.University;

public class UniversityRun {
    public static void main(String[] args) {
        University university = new University("Sample", 456, true);
        System.out.println(university);
    }

    public static class PlaneRun {
        public static void main(String[] args) {
            Pharmacy pharmacy = new Pharmacy("Sample", 456, true);
            System.out.println(pharmacy);
        }
    }
}
