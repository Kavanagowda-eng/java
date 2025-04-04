package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Rain;
import com.xworkz.Inheritence.internal.Umbrella;

public class RainRunner {
    public static void main(String[] args) {

        Rain rain = new Rain();
        rain.water();
        rain.weather();
        rain.mud();
        rain.raincoat();
        rain.cloud();

        System.out.println("--------------------------------");

        Rain rain1 = new Umbrella();
        rain1.water();
        rain1.weather();
        rain1.mud();
        rain1.raincoat();
        rain1.cloud();

        System.out.println("--------------------------------");

        Umbrella umbrella = new Umbrella();
        umbrella.water();
        umbrella.weather();
        umbrella.mud();
        umbrella.raincoat();
        umbrella.cloud();

        System.out.println("--------------------------------");
    }
}
