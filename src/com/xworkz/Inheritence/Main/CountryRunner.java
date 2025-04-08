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

        India india1=new India();
        india1.type();
        india1.flag();
        india1.travel();
        india1.trees();
        india1.population();
        System.out.println("--------------------------------");

        India india2=new India();
        india2.type();
        india2.flag();
        india2.travel();
        india2.trees();
        india2.population();

        System.out.println("--------------------------------");

        India india3=new India();
        india3.type();
        india3.flag();
        india3.travel();
        india3.trees();
        india3.population();

        System.out.println("--------------------------------");
    }
}
