package lldDesignPatterns.StrategyDP.VehicleClass.VehicleTypes;

import lldDesignPatterns.StrategyDP.VehicleClass.Vehicle;
import lldDesignPatterns.StrategyDP.VehicleClass.DriveStrategy.Strategies.LuxuryDS;

public class sedan extends Vehicle{
    
    public sedan(){
        super(new LuxuryDS());
    }
    
    @Override
    public void drive(){
        System.out.println("This is a Sedan.");
        super.drive();
    }
}
