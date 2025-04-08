package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Bird;
import com.xworkz.Inheritence.internal.Parrot;

public class BirdRunner {
        public static void main(String[] args) {
            Bird bird = new Bird();
            bird.makeSound();
            bird.eat();
            bird.drink();
            bird.fly();
            bird.sleep();
            System.out.println("--------------------------------");

            Bird bird1 = new Parrot();
            bird1.makeSound();
            bird1.eat();
            bird1.drink();
            bird1.fly();
            bird1.sleep();
            System.out.println("--------------------------------");

            Bird bird2 = new Parrot();
            bird2.makeSound();
            bird2.eat();
            bird2.drink();
            bird2.fly();
            bird2.sleep();
            System.out.println("--------------------------------");

            Bird bird3 = new Parrot();
            bird3.makeSound();
            bird3.eat();
            bird3.drink();
            bird3.fly();
            bird3.sleep();
            System.out.println("--------------------------------");
        }
    }

