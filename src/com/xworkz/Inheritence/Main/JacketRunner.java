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
    }
}
