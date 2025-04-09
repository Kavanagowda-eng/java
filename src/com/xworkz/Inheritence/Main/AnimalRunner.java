package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.Casting.AnimalCast;
import com.xworkz.Inheritence.internal.Elephant;
import com.xworkz.Inheritence.External.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makeSound();
        animal.eat();
        animal.drink();
        animal.walk();
        animal.sleep();
        System.out.println("--------------------------------");

        Animal animal1=new Elephant();
        animal1.makeSound();
        animal1.eat();
        animal1.drink();
        animal1.walk();
        animal1.sleep();
        animal1.play();
        System.out.println("--------------------------------");

        Animal animal2=new Elephant();
        animal2.makeSound();
        animal2.eat();
        animal2.drink();
        animal2.walk();
        animal2.sleep();
        animal2.play();
        System.out.println("--------------------------------");

        Animal animal3=new Elephant();
        animal3.makeSound();
        animal3.eat();
        animal3.drink();
        animal3.walk();
        animal3.sleep();
        animal3.play();
        System.out.println("--------------------------------");

        Elephant elephant=new Elephant();
        elephant.drink();
        elephant.eat();
        elephant.walk();
        elephant.sleep();
        elephant.makeSound();
        System.out.println("-------------------------");

    AnimalCast animalCast=new AnimalCast();
        animalCast.eat(animal);
        animalCast.eat(elephant);
    }
}
