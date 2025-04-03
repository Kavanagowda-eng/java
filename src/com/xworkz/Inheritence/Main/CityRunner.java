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

        System.out.println("--------------------------------");

        Bangalore bangalore = new Bangalore();
        bangalore.type();
        bangalore.shop();
        bangalore.travel();
        bangalore.trees();
        bangalore.population();
    }
}
