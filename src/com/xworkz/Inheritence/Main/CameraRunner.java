package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Camera;
import com.xworkz.Inheritence.internal.Canon;

public class CameraRunner {
    public static void main(String[]args){
        Camera camera1=new Camera();
        camera1.lens();
        camera1.focus();
        camera1.blur();
        camera1.click();
        camera1.quality();

        System.out.println("------------------------");

        Canon canon=new Canon();
        canon.lens();
        canon.focus();
        canon.blur();
        canon.click();
        canon.quality();

        System.out.println("------------------------");

        Camera camera2=new Camera();
        camera2.lens();
        camera2.focus();
        camera2.blur();
        camera2.click();
        camera2.quality();

        System.out.println("------------------------");
    }
}
