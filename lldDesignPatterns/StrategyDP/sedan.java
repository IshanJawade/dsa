package lldDesignPatterns.StrategyDP;

import lldDesignPatterns.StrategyDP.Vehicle.Vehicle;
import lldDesignPatterns.StrategyDP.Vehicle.strategies.LuxuryDS;

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
