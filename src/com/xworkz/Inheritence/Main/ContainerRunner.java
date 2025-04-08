package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Bottle;
import com.xworkz.Inheritence.External.Container;
import com.xworkz.Inheritence.internal.Bottel;

public class ContainerRunner {
    public static void main (String[]args){
        Container container = new Container();
        container.capacity();
        container.color();
        container.empty();
        container.fill();
        container.size();

        Container container1= new Bottel();
        container1.capacity();
        container1.color();
        container1.empty();
        container1.fill();
        container1.size();
        System.out.println("--------------------------------");

        Bottel bottel1 = new Bottel();
        bottel1.capacity();
        bottel1.color();
        bottel1.empty();
        bottel1.fill();
        bottel1.size();
        System.out.println("--------------------------------");

        Bottel bottel2 = new Bottel();
        bottel2.capacity();
        bottel2.color();
        bottel2.empty();
        bottel2.fill();
        bottel2.size();
        System.out.println("--------------------------------");

        Bottel bottel3= new Bottel();
        bottel3.capacity();
        bottel3.color();
        bottel3.empty();
        bottel3.fill();
        bottel3.size();
        System.out.println("--------------------------------");
    }
}
