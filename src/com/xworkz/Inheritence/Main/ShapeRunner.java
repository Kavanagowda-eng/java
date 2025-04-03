package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Shape;
import com.xworkz.Inheritence.internal.Circle;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.color();
        shape.draw();
        shape.move();
        shape.resize();
        shape.rotate();

        Shape shape1 = new Circle();
        shape1.color();
        shape1.draw();
        shape1.move();
        shape1.resize();
        shape1.rotate();

        Shape shape2 = new Circle();
        shape2.color();
        shape2.draw();
        shape2.move();
        shape2.resize();
        shape2.rotate();

        Shape shape3 = new Circle();
        shape3.color();
        shape3.draw();
        shape3.move();
        shape3.resize();
        shape3.rotate();
    }
}
