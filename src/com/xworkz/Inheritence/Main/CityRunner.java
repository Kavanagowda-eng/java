package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.City;
import com.xworkz.Inheritence.internal.Bangalore;

public class CityRunner {
    public static void main(String[] args) {
        City city1 = new Bangalore();
        city1.type();
        city1.shop();
        city1.travel();
        city1.trees();
        city1.population();
        System.out.println("------------------------");

        Bangalore bangalore = new Bangalore();
        bangalore.type();
        bangalore.shop();
        bangalore.travel();
        bangalore.trees();
        bangalore.population();
        System.out.println("------------------------");

        Bangalore bangalore1 = new Bangalore();
        bangalore1.type();
        bangalore1.shop();
        bangalore1.travel();
        bangalore1.trees();
        bangalore1.population();
        System.out.println("------------------------");

        Bangalore bangalore2 = new Bangalore();
        bangalore2.type();
        bangalore2.shop();
        bangalore2.travel();
        bangalore2.trees();
        bangalore2.population();
        System.out.println("------------------------");

        Bangalore bangalore3 = new Bangalore();
        bangalore3.type();
        bangalore3.shop();
        bangalore3.travel();
        bangalore3.trees();
        bangalore3.population();
        System.out.println("------------------------");
    }
}
