package lldDesignPatterns.strategyDP;

import lldDesignPatterns.strategyDP.Vehicle.Vehicle;
import lldDesignPatterns.strategyDP.Vehicle.strategies.RegularDS;


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
