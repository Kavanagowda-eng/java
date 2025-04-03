package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Temple;
import com.xworkz.Inheritence.internal.HinduTemple;

public class TempleRunner {

        public static void main(String[] args) {
            Temple temple = new Temple();
            temple.openTemple();
            temple.performPuja();
            temple.offerPrasad();
            temple.ringBell();
            temple.closeTemple();

            Temple temple1 = new HinduTemple();
            temple1.openTemple();
            temple1.performPuja();
            temple1.offerPrasad();
            temple1.ringBell();
            temple1.closeTemple();

            Temple temple2 = new HinduTemple();
            temple2.openTemple();
            temple2.performPuja();
            temple2.offerPrasad();
            temple2.ringBell();
            temple2.closeTemple();

            Temple temple3 = new HinduTemple();
            temple3.openTemple();
            temple3.performPuja();
            temple3.offerPrasad();
            temple3.ringBell();
            temple3.closeTemple();
        }
}
