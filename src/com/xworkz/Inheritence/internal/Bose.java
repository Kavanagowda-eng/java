package com.xworkz.Inheritence.internal;
import com.xworkz.Inheritence.External.Headphone;
public class Bose extends Headphone {
    public Bose (){
        super();
        System.out.println("No args const in Bose");
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void design() {
        super.design();
    }

    @Override
    public void color() {
        super.color();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void use() {
        super.use();
    }
    public void sound() {
        System.out.println("sound of the earphone");
}

}
