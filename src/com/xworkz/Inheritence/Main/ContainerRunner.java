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

        Container container2 = new Bottel();
        container2.capacity();
        container2.color();
        container2.empty();
        container2.fill();
        container2.size();


    }
}
