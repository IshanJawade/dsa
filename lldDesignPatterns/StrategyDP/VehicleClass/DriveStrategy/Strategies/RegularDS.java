package lldDesignPatterns.StrategyDP.VehicleClass.DriveStrategy.Strategies;

import lldDesignPatterns.StrategyDP.VehicleClass.DriveStrategy.DriveStrategy;

public class RegularDS implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("This is a Regular vehicle.");
    }
}
