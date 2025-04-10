package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.House;

public class HouseRun {
    public static void main(String[] args) {
        House house = new House("Sample", 456, true);
        System.out.println(house);
        System.out.println(house.hashCode());
        System.out.println("Original:"+System.identityHashCode(house));
        System.out.println("-------------------------");
    }
}
