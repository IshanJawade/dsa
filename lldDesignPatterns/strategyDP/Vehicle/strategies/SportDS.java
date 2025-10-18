package lldDesignPatterns.strategyDP.Vehicle.strategies;

public class SportDS implements DriveStrategy{
    
    @Override
    public void drive(){
        System.out.println("This is a Sport vehicle.");
    }
}
