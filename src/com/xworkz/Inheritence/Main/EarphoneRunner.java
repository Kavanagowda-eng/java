package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Earphone;
import com.xworkz.Inheritence.internal.Bluetooth;

public class EarphoneRunner {
    public static void main(String[]args){
        Earphone earphone=new Earphone();
        earphone.purchase();
        earphone.connect();
        earphone.mobile();
        earphone.device();
        earphone.share();

        Earphone earphone1=new Earphone();
        earphone1.purchase();
        earphone1.connect();
        earphone1.mobile();
        earphone1.device();
        earphone1.share();
        System.out.println("--------------------------------");

        Earphone earphone2=new Bluetooth();
        earphone2.purchase();
        earphone2.connect();
        earphone2.mobile();
        earphone2.device();
        earphone2.share();
        System.out.println("--------------------------------");

        Earphone earphone3=new Bluetooth();
        earphone3.purchase();
        earphone3.connect();
        earphone3.mobile();
        earphone3.device();
        earphone3.share();
        System.out.println("--------------------------------");


    }
}
