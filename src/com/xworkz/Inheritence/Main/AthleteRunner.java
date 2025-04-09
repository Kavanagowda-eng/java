package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.Casting.AthleteCast;
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

            Athlete athlete3 =new Sports();
            athlete3.run();
            athlete3.rules();
            athlete3.fit();
            athlete3.type();
            athlete3.workout();
            System.out.println("--------------------------------");

            Sports sports =new Sports();
            sports.run();
            sports.rules();
            sports.fit();
            sports.type();
            sports.workout();
            System.out.println("--------------------------------");

            AthleteCast athleteCast=new AthleteCast();
            athleteCast.run(athlete1);
            athleteCast.run(sports);
        }

    }
