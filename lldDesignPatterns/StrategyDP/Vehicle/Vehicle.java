package lldDesignPatterns.StrategyDP.Vehicle;

import lldDesignPatterns.StrategyDP.Vehicle.strategies.DriveStrategy;

public class Vehicle {

    public DriveStrategy obj;

    // Constructor
    protected Vehicle(DriveStrategy _obj){
        this.obj = _obj;
    }
    
    public void drive(){
        System.out.println("This is a Vehicle.");
        obj.drive();
    }

}
