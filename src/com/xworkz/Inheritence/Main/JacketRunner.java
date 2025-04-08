package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Jacket;
import com.xworkz.Inheritence.internal.Zip;

public class JacketRunner {
    public static void main (String[]args){
        Jacket jacket1=new Zip();
        jacket1.open();
        jacket1.close();
        jacket1.wash();
        jacket1.borrow();
        jacket1.wear();

        System.out.println("--------------------------------");

        Zip zip=new Zip();
        zip.open();
        zip.close();
        zip.wash();
        zip.borrow();
        zip.wear();

        System.out.println("--------------------------------");

        Zip zip1=new Zip();
        zip1.open();
        zip1.close();
        zip1.wash();
        zip1.borrow();
        zip1.wear();

        System.out.println("--------------------------------");

        Zip zip2=new Zip();
        zip2.open();
        zip2.close();
        zip2.wash();
        zip2.borrow();
        zip2.wear();

        System.out.println("--------------------------------");

        Zip zip3=new Zip();
        zip3.open();
        zip3.close();
        zip3.wash();
        zip3.borrow();
        zip3.wear();

        System.out.println("--------------------------------");
    }
}
