package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Building;

public class BuildingRun {
    public static void main(String[]args){
        Building building = new Building("10", 1, true);
        System.out.println(building);
        System.out.println(building.hashCode());
        System.out.println("Original:"+System.identityHashCode(building));
        System.out.println("-------------------------");
    }
}
