package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Brush;
import com.xworkz.Inheritence.internal.Colgate;

public class BrushRunner {
    public static void main (String[]args){
        Brush brush=new Brush();
        brush.clean();
        brush.shoes();
        brush.purchase();
        brush.wash();
        brush.use();

        System.out.println("--------------------------------");

        Brush brush1=new Colgate();
        brush1.clean();
        brush1.shoes();
        brush1.purchase();
        brush1.wash();
        brush1.use();

        System.out.println("--------------------------------");

        Colgate colgate=new Colgate();
        colgate.clean();
        colgate.shoes();
        colgate.purchase();
        colgate.wash();
        colgate.use();

        System.out.println("--------------------------------");

        Colgate colgate1=new Colgate();
        colgate1.clean();
        colgate1.shoes();
        colgate1.purchase();
        colgate1.wash();
        colgate1.use();

        System.out.println("--------------------------------");

        Colgate colgate2=new Colgate();
        colgate2.clean();
        colgate2.shoes();
        colgate2.purchase();
        colgate2.wash();
        colgate2.use();

        System.out.println("--------------------------------");
    }
}
