package lldDesignPatterns.StrategyDP.VehicleClass.VehicleTypes;

import lldDesignPatterns.StrategyDP.VehicleClass.Vehicle;
import lldDesignPatterns.StrategyDP.VehicleClass.DriveStrategy.Strategies.SportDS;

public class suv extends Vehicle{

    public suv(){
        super(new SportDS());
    }
    
    @Override
    public void drive(){
        System.out.println("This is a SUV.");
        super.drive();
    }
}
