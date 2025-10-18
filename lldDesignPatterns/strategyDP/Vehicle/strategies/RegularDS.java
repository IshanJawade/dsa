package lldDesignPatterns.strategyDP.Vehicle.strategies;

public class RegularDS implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("This is a Regular vehicle.");
    }
}
