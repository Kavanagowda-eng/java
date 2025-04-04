package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Rubber;
import com.xworkz.Inheritence.internal.Synthetic;

public class RubberRunner {
    public static void main(String[]args){
        Rubber rubber=new Rubber();
        rubber.type();
        rubber.design();
        rubber.use();
        rubber.color();
        rubber.clean();

        System.out.println("--------------------------------");

        Rubber rubber1=new Synthetic();
        rubber1.type();
        rubber1.design();
        rubber1.use();
        rubber1.color();
        rubber1.clean();

        System.out.println("--------------------------------");

        Synthetic synthetic=new Synthetic();
        synthetic.type();
        synthetic.design();
        synthetic.use();
        synthetic.color();
        synthetic.clean();

        System.out.println("--------------------------------");
    }

}
