package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.Clinic;

public class ClinicRun {
    public static void main(String[] args) {
        Clinic clinic = new Clinic("Dr. Smith", 5, true);
        System.out.println(clinic);
        System.out.println(clinic.hashCode());
        System.out.println("Original:"+System.identityHashCode(clinic));
        System.out.println("-------------------------");
    }
}
