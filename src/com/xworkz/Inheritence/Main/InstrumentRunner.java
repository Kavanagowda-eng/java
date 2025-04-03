package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Instrument;

public class InstrumentRunner {
    public static void main(String[]args) {
        Instrument instrument = new Instrument();
        instrument.cords();
        instrument.keys();
        instrument.play();
        instrument.strings();

        Instrument instrument1= new Instrument();
        instrument1.cords();
        instrument1.keys();
        instrument1.play();
        instrument1.strings();

        Instrument instrument2 = new Instrument();
        instrument2.cords();
        instrument2.keys();
        instrument2.play();
        instrument2.strings();

        Instrument instrument3 = new Instrument();
        instrument3.cords();
        instrument3.keys();
        instrument3.play();
        instrument3.strings();
    }
}
