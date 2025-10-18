package lldDesignPatterns.StrategyDP;

import lldDesignPatterns.StrategyDP.Vehicle.Vehicle;
import lldDesignPatterns.StrategyDP.Vehicle.strategies.RegularDS;


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
