package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Plant;
import com.xworkz.Inheritence.internal.Rose;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant=new Plant();
        plant.grow();
        plant.dead();
        plant.seed();
        plant.dead();
        plant.leaves();

        System.out.println("--------------------------------");

        Plant plant1=new Rose();
        plant1.grow();
        plant1.dead();
        plant1.seed();
        plant1.dead();
        plant1.leaves();

        System.out.println("--------------------------------");

        Rose rose=new Rose();
        rose.grow();
        rose.dead();
        rose.seed();
        rose.dead();
        rose.leaves();

    }
}
