package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.Casting.ClockCast;
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

        Clock clock2=new Casio();
        clock2.type();
        clock2.duration();
        clock2.lens();
        clock2.color();
        clock2.quality();
        System.out.println("--------------------------------");

        Clock clock3=new Casio();
        clock3.type();
        clock3.duration();
        clock3.lens();
        clock3.color();
        clock3.quality();
        System.out.println("--------------------------------");

        Casio casio=new Casio();
        casio.type();
        casio.duration();
        casio.lens();
        casio.color();
        casio.quality();
        System.out.println("--------------------------------");

        ClockCast clockCast=new ClockCast();
        clockCast.lens(clock1);
        clockCast.lens(casio);

    }
}
