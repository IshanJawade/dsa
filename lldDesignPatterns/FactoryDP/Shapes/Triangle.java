package lldDesignPatterns.FactoryDP.Shapes;

public class Triangle implements Shape{

    @Override
    public void draw(){
        System.out.println("Triangle.");
    }
}