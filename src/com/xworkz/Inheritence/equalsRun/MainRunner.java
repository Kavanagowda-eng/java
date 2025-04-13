package com.xworkz.Inheritence.equalsRun;

import com.xworkz.Inheritence.ToString1.AirConditioner;
import com.xworkz.Inheritence.ToString1.Apartment;
import com.xworkz.Inheritence.ToString1.Bar;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        AirConditioner airConditioner1 = new AirConditioner("Lenovo", 6, true);
        AirConditioner airConditioner2 = new AirConditioner("Lenevo", 6, true);
        System.out.println("Both are same: " + airConditioner1.equals(airConditioner2));

        System.out.println("---------------------------------------------");
        Apartment apartment1 = new Apartment("marbal", 2000, true);
        Apartment apartment2 = new Apartment("marbel", 2000, true);
        System.out.println("Both are same: " + apartment1.equals(apartment2));

        System.out.println("---------------------------------------------");
        Bar bar1 = new Bar("Bachardi", 34, true);
        Bar bar2 = new Bar("bachardi", 123, true);
        System.out.println("Both are same: " + bar1.equals(bar2));
    }



    }

