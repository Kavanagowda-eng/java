package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Government;
import com.xworkz.Inheritence.internal.Democracy;

public class GovernmentRunner {
    public static void main(String[] args) {

        Government government = new Government();
        government.makeLaws();
        government.collectTaxes();
        government.enforceLaws();
        government.conductElections();
        government.provideService();
        System.out.println("------------------------");

        Government government1 = new Democracy();
        government1.makeLaws();
        government1.collectTaxes();
        government1.enforceLaws();
        government1.conductElections();
        government1.provideService();
        System.out.println("------------------------");

        Government government2 = new Democracy();
        government2.makeLaws();
        government2.collectTaxes();
        government2.enforceLaws();
        government2.conductElections();
        government2.provideService();
        System.out.println("------------------------");

        Government government3 = new Democracy();
        government3.makeLaws();
        government3.collectTaxes();
        government3.enforceLaws();
        government3.conductElections();
        government3.provideService();
        System.out.println("------------------------");

    }
}
