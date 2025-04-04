package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Photographer;
import com.xworkz.Inheritence.internal.Photos;

public class PhotographerRunner {
    public static void main(String[]args){
        Photographer photographer=new Photographer();
        photographer.click();
        photographer.passion();
        photographer.followers();
        photographer.type();
        photographer.rating();

        System.out.println("--------------------------------");

        Photographer photographer1=new Photos();
        photographer1.click();
        photographer1.passion();
        photographer1.followers();
        photographer1.type();
        photographer1.rating();

        System.out.println("--------------------------------");

        Photos photos=new Photos();
        photos.click();
        photos.passion();
        photos.followers();
        photos.type();
        photos.rating();

        System.out.println("--------------------------------");
    }
}
