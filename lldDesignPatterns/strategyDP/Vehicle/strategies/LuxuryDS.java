package lldDesignPatterns.strategyDP.Vehicle.strategies;

public class LuxuryDS implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("This is a Luxury vehicle.");
    }
    
}
