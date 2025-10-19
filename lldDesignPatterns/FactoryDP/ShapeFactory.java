package lldDesignPatterns.FactoryDP;

import lldDesignPatterns.FactoryDP.Shapes.Circle;
import lldDesignPatterns.FactoryDP.Shapes.Shape;
import lldDesignPatterns.FactoryDP.Shapes.Square;
import lldDesignPatterns.FactoryDP.Shapes.Triangle;

public class ShapeFactory {
    
    public Shape getShape(String des){

        switch (des.toLowerCase()) {
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            default:
                System.out.println("Unknown shape: " + des);
                return null;
        }
    }
}
