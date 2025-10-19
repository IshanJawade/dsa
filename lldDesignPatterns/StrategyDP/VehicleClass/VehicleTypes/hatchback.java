package lldDesignPatterns.StrategyDP.VehicleClass.VehicleTypes;

import lldDesignPatterns.StrategyDP.VehicleClass.Vehicle;
import lldDesignPatterns.StrategyDP.VehicleClass.DriveStrategy.Strategies.RegularDS;


public class hatchback extends Vehicle {
    
    public hatchback(){
        super(new RegularDS());
    }

    @Override
    public void drive(){
        System.out.println("This is a Hatchback.");
        super.drive();
    }

}
