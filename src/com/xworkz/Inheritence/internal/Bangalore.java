package com.xworkz.Inheritence.internal;


import com.xworkz.Inheritence.External.City;

public class Bangalore extends City {
        public Bangalore(){
            super();
            System.out.println("No args const in bangalore");
        }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void population() {
        super.population();
    }

    @Override
    public void shop() {
        super.shop();
    }

    @Override
    public void travel() {
        super.travel();
    }

    @Override
    public void trees() {
        super.trees();
    }
    public void street() {
        System.out.println("streets");
    }
}

