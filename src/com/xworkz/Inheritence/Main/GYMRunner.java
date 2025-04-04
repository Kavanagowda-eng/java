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
    }
}
