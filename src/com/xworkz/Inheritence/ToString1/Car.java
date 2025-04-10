package com.xworkz.Inheritence.ToString1;

public class Car {
        private String model;
        private String color;
        private int year;

        public Car(String model, String color, int year) {
            this.model = model;
            this.color = color;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Model: " + this.model + ", Color: " + this.color + ", Year: " + this.year;
        }
    @Override
    public int hashCode() {
        return 45;}
    }
