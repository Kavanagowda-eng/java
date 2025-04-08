package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Floor;
import com.xworkz.Inheritence.internal.Granite;

public class FloorRunner {
    public static void main(String[] args) {
        Floor floor = new Floor();
        floor.floorType();
        floor.floorColour();
        floor.flooringShop();
        floor.noOfGranite();
        floor.pricePerFeet();
        System.out.println("--------------------------------");

        Floor floor1 = new Granite();
        floor1.pricePerFeet();
        floor1.floorType();
        floor1.noOfGranite();
        floor1.floorColour();
        floor1.flooringShop();
        System.out.println("--------------------------------");

        Floor floor2 = new Granite();
        floor2.pricePerFeet();
        floor2.floorType();
        floor2.noOfGranite();
        floor2.floorColour();
        floor2.flooringShop();
        System.out.println("--------------------------------");

        Floor floor3 = new Granite();
        floor3.pricePerFeet();
        floor3.floorType();
        floor3.noOfGranite();
        floor3.floorColour();
        floor3.flooringShop();
        System.out.println("--------------------------------");
    }

}
