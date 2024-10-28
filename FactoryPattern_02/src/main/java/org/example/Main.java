package org.example;

import org.example.simpleShapeFactory.Shape;
import org.example.simpleShapeFactory.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        //Simple Shape Factory
        //Step 01 create interface Shape
        //Step 02 create concrete classes Circle, Rectangle, Square
        //Step 03 create ShapeFactory

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();


    }



}