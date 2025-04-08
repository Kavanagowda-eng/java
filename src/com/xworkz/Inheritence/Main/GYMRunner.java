package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Gym;
import com.xworkz.Inheritence.internal.WorkOut;

public class GYMRunner {
    public static void main(String[]args){
        Gym gym1=new WorkOut();
        gym1.type();
        gym1.location();
        gym1.place();
        gym1.dumbbells();
        gym1.visit();

        System.out.println("--------------------------------");

        WorkOut workOut=new WorkOut();
        workOut.type();
        workOut.location();
        workOut.place();
        workOut.dumbbells();
        workOut.visit();

        System.out.println("--------------------------------");

        WorkOut workOut1=new WorkOut();
        workOut1.type();
        workOut1.location();
        workOut1.place();
        workOut1.dumbbells();
        workOut1.visit();

        System.out.println("--------------------------------");

        WorkOut workOut2=new WorkOut();
        workOut2.type();
        workOut2.location();
        workOut2.place();
        workOut2.dumbbells();
        workOut2.visit();

        System.out.println("--------------------------------");

        WorkOut workOut3=new WorkOut();
        workOut3.type();
        workOut3.location();
        workOut3.place();
        workOut3.dumbbells();
        workOut3.visit();

        System.out.println("--------------------------------");
    }
}
