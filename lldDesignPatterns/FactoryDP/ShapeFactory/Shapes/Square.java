package lldDesignPatterns.FactoryDP.ShapeFactory.Shapes;

public class Square implements Shape{

    @Override
    public void draw(){
        System.out.println("Square.");
    }
}
