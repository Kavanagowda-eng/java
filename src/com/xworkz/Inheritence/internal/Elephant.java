package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Animal;

public class Elephant extends Animal {
    public Elephant() {
        super();
        System.out.println("no argument");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    public void play(){
        System.out.println("Elephant is playing");

    }
}

