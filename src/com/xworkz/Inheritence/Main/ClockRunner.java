package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Clock;
import com.xworkz.Inheritence.internal.Casio;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock1=new Casio();
        clock1.type();
        clock1.duration();
        clock1.lens();
        clock1.color();
        clock1.quality();

        System.out.println("--------------------------------");

        Casio casio=new Casio();
        casio.type();
        casio.duration();
        casio.lens();
        casio.color();
        casio.quality();
        System.out.println("--------------------------------");

        Casio casio1=new Casio();
        casio1.type();
        casio1.duration();
        casio1.lens();
        casio1.color();
        casio1.quality();
        System.out.println("--------------------------------");

        Casio casio2=new Casio();
        casio2.type();
        casio2.duration();
        casio2.lens();
        casio2.color();
        casio2.quality();
        System.out.println("--------------------------------");

        Casio casio3=new Casio();
        casio3.type();
        casio3.duration();
        casio3.lens();
        casio3.color();
        casio3.quality();
        System.out.println("--------------------------------");
    }
}
