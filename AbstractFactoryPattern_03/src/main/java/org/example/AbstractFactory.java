package org.example;

import org.example.colors.Color;
import org.example.shapes.Shape;

public abstract class AbstractFactory {

    public Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String colorType) {
        return null;
    }
}
