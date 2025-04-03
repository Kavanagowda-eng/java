package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Tshirt;
import com.xworkz.Inheritence.internal.Casual;

public class TshirtRunner {
    public static void main(String[] args) {
        Tshirt tshirt=new Tshirt();
        tshirt.type();
        tshirt.design();
        tshirt.show();
        tshirt.color();
        tshirt.use();

        Tshirt tshirt1=new Casual();
        tshirt1.type();
        tshirt1.design();
        tshirt1.show();
        tshirt1.color();
        tshirt1.use();

        Casual casual=new Casual();
        casual.type();
        casual.design();
        casual.show();
        casual.color();
        casual.use();



    }
}
