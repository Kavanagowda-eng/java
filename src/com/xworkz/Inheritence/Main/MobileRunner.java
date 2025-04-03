package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Mobile;
import com.xworkz.Inheritence.internal.Smartphone;

public class MobileRunner {

    public static void main(String[] args) {
        System.out.println("Basic Mobile Functions");
        Mobile mobile = new Mobile();
        mobile.makeCall();
        mobile.sendMessage();
        mobile.browseInternet();
        mobile.playMusic();
        mobile.chargeBattery();

        Mobile mobile1 = new Smartphone();
        mobile1.makeCall();
        mobile1.sendMessage();
        mobile1.browseInternet();
        mobile1.playMusic();
        mobile1.chargeBattery();

        Mobile mobile2 = new Smartphone();
        mobile2.makeCall();
        mobile2.sendMessage();
        mobile2.browseInternet();
        mobile2.playMusic();
        mobile2.chargeBattery();

        Mobile mobile3= new Smartphone();
        mobile3.makeCall();
        mobile3.sendMessage();
        mobile3.browseInternet();
        mobile3.playMusic();
        mobile3.chargeBattery();

    }
}
