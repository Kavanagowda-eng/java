package com.xworkz.Inheritence.External;

public class Food {
    public Food() {
            System.out.println("Food is the superclass");
        }

        public void prepare() {
            System.out.println("Food is being prepared");
        }

        public void serve() {
            System.out.println("Food is being served");
        }

        public void eat() {
            System.out.println("Food is being eaten");
        }

        public void getIngredients() {
            System.out.println("Food requires ingredients");
        }

        public void store() {
            System.out.println("Food is stored for later use");
        }
    }

