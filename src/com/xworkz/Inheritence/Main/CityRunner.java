package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.Casting.CityCast;
import com.xworkz.Inheritence.External.City;
import com.xworkz.Inheritence.internal.Bangalore;

public class CityRunner {
    public static void main(String[] args) {
        City city = new Bangalore();
        city.type();
        city.shop();
        city.travel();
        city.trees();
        city.population();
        System.out.println("------------------------");

        City city1 = new Bangalore();
        city1.type();
        city1.shop();
        city1.travel();
        city1.trees();
        city1.population();
        System.out.println("------------------------");

        City city2= new Bangalore();
        city2.type();
        city2.shop();
        city2.travel();
        city2.trees();
        city2.population();
        System.out.println("------------------------");

        City city3 = new Bangalore();
        city3.type();
        city3.shop();
        city3.travel();
        city3.trees();
        city3.population();
        System.out.println("------------------------");

        Bangalore bangalore = new Bangalore();
        bangalore.type();
        bangalore.shop();
        bangalore.travel();
        bangalore.trees();
        bangalore.population();
        System.out.println("------------------------");

        CityCast cityCast=new CityCast();
        cityCast.type(city);
        cityCast.type(bangalore);

       }
}
