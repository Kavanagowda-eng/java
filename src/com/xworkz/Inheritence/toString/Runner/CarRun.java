package com.xworkz.Inheritence.toString.Runner;
import com.xworkz.Inheritence.ToString1.Car;

public class CarRun {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red", 2023);
        System.out.println(car);
        System.out.println(car.hashCode());
        System.out.println("Original:"+System.identityHashCode(car));
        System.out.println("-------------------------");
    }
}
