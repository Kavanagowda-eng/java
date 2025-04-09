package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Animal;
import com.xworkz.Inheritence.External.Athlete;

public class Sports extends Athlete {
    public Sports(){
        super();
        System.out.println("No args const in Sports");
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void fit() {
        super.fit();
    }

    @Override
    public void rules() {
        super.rules();
    }

    @Override
    public void workout() {
        super.workout();
    }

    @Override
    public void type() {
        super.type();
    }
    public void color() {
        System.out.println("color of the Athlate");
    }
}
