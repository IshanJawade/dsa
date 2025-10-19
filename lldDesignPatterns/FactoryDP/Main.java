package lldDesignPatterns.FactoryDP;

import lldDesignPatterns.FactoryDP.Shapes.Shape;

public class Main {
    public static void main(String[] args) {

        ShapeFactory factory =  new ShapeFactory();

        Shape shape1 = factory.getShape("Circle");
        shape1.draw();

        Shape shape2 = factory.getShape("Square");
        shape2.draw();

        Shape shape3 = factory.getShape("Triangle");
        shape3.draw();

        Shape shape4 = factory.getShape("Something");
        shape4.draw();
    }
}
