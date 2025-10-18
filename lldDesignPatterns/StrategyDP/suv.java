package lldDesignPatterns.StrategyDP;

import lldDesignPatterns.StrategyDP.Vehicle.Vehicle;
import lldDesignPatterns.StrategyDP.Vehicle.strategies.SportDS;

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
