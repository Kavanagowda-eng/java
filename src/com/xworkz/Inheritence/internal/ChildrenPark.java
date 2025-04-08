package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Park;

public class ChildrenPark extends Park {

        public ChildrenPark() {
            super();
            System.out.println("ChildrenPark is a subclass");
        }


    @Override
    public void closePark() {
        super.closePark();
    }

    @Override
    public void maintainGreenery() {
        super.maintainGreenery();
    }

    @Override
    public void openPark() {
        super.openPark();
    }

    @Override
    public void provideSeatingArea() {
        super.provideSeatingArea();
    }

    @Override
    public void provideWalkingTrack() {
        super.provideWalkingTrack();
    }
    public void color() {
        System.out.println("color of the Park");
    }
}


