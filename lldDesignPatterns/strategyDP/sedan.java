package lldDesignPatterns.strategyDP;

import lldDesignPatterns.strategyDP.Vehicle.Vehicle;
import lldDesignPatterns.strategyDP.Vehicle.strategies.LuxuryDS;

public class sedan extends Vehicle{
    
    public sedan(){
        super(new LuxuryDS());
    }
    
    public void drive(){
        System.out.println("This is a Sedan.");
        super.drive();
    }
}
