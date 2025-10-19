package lldDesignPatterns.FactoryDP.ShapeFactory.Shapes;

public class Circle implements Shape{

    @Override
    public void draw(){
        System.out.println("Circle.");
    }
}