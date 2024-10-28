package org.example;

import org.example.colors.Color;
import org.example.colors.ColorFactory;
import org.example.shapes.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //basically factory of factories


        ShapeFactory shapeFactoryProducer = (ShapeFactory) FactoryProducer.getFactory("SHAPE");
        ColorFactory colorFactoryProducer = (ColorFactory) FactoryProducer.getFactory("COLOR");

        shapeFactoryProducer.getShape("CIRCLE").draw();
        shapeFactoryProducer.getShape("SQUARE").draw();

        colorFactoryProducer.getColor("RED").fill();
        colorFactoryProducer.getColor("BLUE").fill();



    }
}