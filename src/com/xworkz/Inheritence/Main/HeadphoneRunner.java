package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Headphone;
import com.xworkz.Inheritence.internal.Bose;
public class HeadphoneRunner {
        public static void main(String[] args) {
            Headphone headphone1=new Headphone();
            headphone1.type();
            headphone1.design();
            headphone1.show();
            headphone1.color();
            headphone1.use();
            System.out.println("--------------------------------");

            Headphone headphone2=new Headphone();
            headphone2.type();
            headphone2.design();
            headphone2.show();
            headphone2.color();
            headphone2.use();
            System.out.println("--------------------------------");

            Headphone headphone3=new Headphone();
            headphone3.type();
            headphone3.design();
            headphone3.show();
            headphone3.color();
            headphone3.use();
            System.out.println("--------------------------------");
        }

    }
