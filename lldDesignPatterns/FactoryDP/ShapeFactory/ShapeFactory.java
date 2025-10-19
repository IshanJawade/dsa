package lldDesignPatterns.FactoryDP.ShapeFactory;

import lldDesignPatterns.FactoryDP.ShapeFactory.Shapes.Circle;
import lldDesignPatterns.FactoryDP.ShapeFactory.Shapes.Shape;
import lldDesignPatterns.FactoryDP.ShapeFactory.Shapes.Square;
import lldDesignPatterns.FactoryDP.ShapeFactory.Shapes.Triangle;

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
