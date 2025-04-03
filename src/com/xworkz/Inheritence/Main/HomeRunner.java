package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Home;
import com.xworkz.Inheritence.internal.Apartment;

public class HomeRunner {
    public static void main(String[] args) {
            Home home = new Home();
            home.provideShelter();
            home.hasRooms();
            home.hasKitchen();
            home.hasGarden();
            home.secureDoors();

        Home home1 = new Apartment();
        home1.provideShelter();
        home1.hasRooms();
        home1.hasKitchen();
        home1.hasGarden();
        home1.secureDoors();

        Home home2 = new Apartment();
        home2.provideShelter();
        home2.hasRooms();
        home2.hasKitchen();
        home2.hasGarden();
        home2.secureDoors();

        Home home3 = new Apartment();
        home3.provideShelter();
        home3.hasRooms();
        home3.hasKitchen();
        home3.hasGarden();
        home3.secureDoors();

        }
    }

