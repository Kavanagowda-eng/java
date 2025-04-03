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

        Earphone earphone1=new Bluetooth();
        earphone1.purchase();
        earphone1.connect();
        earphone1.mobile();
        earphone1.device();
        earphone1.share();


    }
}
