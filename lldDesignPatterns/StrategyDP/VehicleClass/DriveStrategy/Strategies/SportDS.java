package lldDesignPatterns.StrategyDP.VehicleClass.DriveStrategy.Strategies;

import lldDesignPatterns.StrategyDP.VehicleClass.DriveStrategy.DriveStrategy;

public class SportDS implements DriveStrategy{
    
    @Override
    public void drive(){
        System.out.println("This is a Sport vehicle.");
    }
}
