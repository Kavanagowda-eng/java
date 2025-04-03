package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Village;
import com.xworkz.Inheritence.internal.ModernVillage;

public class VillageRunner {
    public static void main(String[] args) {
            Village village=new Village();
            village.provideWater();
            village.offerFarming();
            village.maintainRoads();
            village.hostFestivals();
            village.offerCommunitySupport();

        Village village1=new ModernVillage();
        village1.provideWater();
        village1.offerFarming();
        village1.maintainRoads();
        village1.hostFestivals();
        village1.offerCommunitySupport();

        Village village2=new ModernVillage();
        village2.provideWater();
        village2.offerFarming();
        village2.maintainRoads();
        village2.hostFestivals();
        village2.offerCommunitySupport();

        Village village3=new ModernVillage();
        village3.provideWater();
        village3.offerFarming();
        village3.maintainRoads();
        village3.hostFestivals();
        village3.offerCommunitySupport();
        }
    }



