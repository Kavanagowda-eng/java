package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Athlete;
import com.xworkz.Inheritence.internal.Sports;

public class AthleteRunner {
        public static void main(String[]args){
            Athlete athlete1=new Athlete();
            athlete1.run();
            athlete1.rules();
            athlete1.fit();
            athlete1.type();
            athlete1.workout();

            System.out.println("--------------------------------");

            Athlete athlete2 =new Sports();
            athlete2.run();
            athlete2.rules();
            athlete2.fit();
            athlete2.type();
            athlete2.workout();

            System.out.println("--------------------------------");


        }

    }
