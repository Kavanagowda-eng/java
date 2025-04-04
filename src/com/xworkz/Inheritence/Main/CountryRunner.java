package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Country;
import com.xworkz.Inheritence.internal.India;

public class CountryRunner {
    public static void main(String[]args){
        Country country=new Country();
        country.type();
        country.flag();
        country.travel();
        country.trees();
        country.population();

        System.out.println("--------------------------------");

        Country country1=new India();
        country1.type();
        country1.flag();
        country1.travel();
        country1.trees();
        country1.population();

        System.out.println("--------------------------------");

        India india=new India();
        india.type();
        india.flag();
        india.travel();
        india.trees();
        india.population();

        System.out.println("--------------------------------");
    }
}
