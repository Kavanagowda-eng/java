package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Home;

public class Apartment extends Home {

    public Apartment() {
        super();
        System.out.println("Apartment is a subclass");
    }

    @Override
    public void hasGarden() {
        super.hasGarden();
    }

    @Override
    public void hasKitchen() {
        super.hasKitchen();
    }

    @Override
    public void hasRooms() {
        super.hasRooms();
    }

    @Override
    public void provideShelter() {
        super.provideShelter();
    }

    @Override
    public void secureDoors() {
        super.secureDoors();
    }

    public void color() {
        System.out.println("color of the fruit");
    }
}

