package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Building;
import com.xworkz.Inheritence.internal.House;

public class BuildingRunner {
    public static void main (String[]args) {
        Building building = new Building();
        building.bhk();
        building.blocks();
        building.floor();
        building.rooms();
        building.security();

        Building building1 = new House();
        building1.bhk();
        building1.blocks();
        building1.floor();
        building1.rooms();
        building1.security();

        Building building2 = new House();
        building2.bhk();
        building2.blocks();
        building2.floor();
        building2.rooms();
        building2.security();

        Building building3 = new House();
        building3.bhk();
        building3.blocks();
        building3.floor();
        building3.rooms();
        building3.security();


    }

}
