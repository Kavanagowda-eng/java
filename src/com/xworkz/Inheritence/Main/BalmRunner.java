package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Balm;
import com.xworkz.Inheritence.internal.ZanduBalm;

public class BalmRunner {
    public static void main(String[] args) {
        Balm balm=new Balm();
        balm.balmColour();
        balm.balmName();
        balm.cost();
        balm.balmColour();
        balm.balmType();

        Balm balm1=new ZanduBalm();
        balm1.balmType();
        balm1.balmColour();
        balm1.size();
        balm1.balmName();
        balm1.cost();

        Balm balm2=new ZanduBalm();
        balm2.balmType();
        balm2.balmColour();
        balm2.size();
        balm2.balmName();
        balm2.cost();

        Balm balm3=new ZanduBalm();
        balm3.balmType();
        balm3.balmColour();
        balm3.size();
        balm3.balmName();
        balm3.cost();
    }

}
