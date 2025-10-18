package lldDesignPatterns.strategyDP;

import lldDesignPatterns.strategyDP.Vehicle.Vehicle;
import lldDesignPatterns.strategyDP.Vehicle.strategies.SportDS;

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
