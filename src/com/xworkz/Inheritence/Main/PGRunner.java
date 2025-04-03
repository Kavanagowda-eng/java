package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.PG;
import com.xworkz.Inheritence.internal.LuxuryPG;

public class PGRunner {
    public static void main(String[] args) {
        PG pg = new PG();
        pg.provideRoom();
        pg.offerFood();
        pg.provideWiFi();
        pg.ensureSecurity();
        pg.manageRent();

        PG pg1 = new LuxuryPG();
        pg1.provideRoom();
        pg1.offerFood();
        pg1.provideWiFi();
        pg1.ensureSecurity();
        pg1.manageRent();

        PG pg2 = new LuxuryPG();
        pg2.provideRoom();
        pg2.offerFood();
        pg2.provideWiFi();
        pg2.ensureSecurity();
        pg2.manageRent();

        PG pg3 = new LuxuryPG();
        pg3.provideRoom();
        pg3.offerFood();
        pg3.provideWiFi();
        pg3.ensureSecurity();
        pg3.manageRent();


    }


    }
