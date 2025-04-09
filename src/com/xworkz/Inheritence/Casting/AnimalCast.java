package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Animal;
import com.xworkz.Inheritence.internal.Elephant;

public class AnimalCast {
    public void eat(Animal animal){
        animal.eat();
        animal.drink();
        animal.walk();
        animal.sleep();
        animal.makeSound();

        if(animal instanceof Elephant){
            Elephant elephant=new Elephant();
            elephant.play();
        }

    }

}
