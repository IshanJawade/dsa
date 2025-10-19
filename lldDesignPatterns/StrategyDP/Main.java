package lldDesignPatterns.StrategyDP;

import lldDesignPatterns.StrategyDP.VehicleClass.Vehicle;
import lldDesignPatterns.StrategyDP.VehicleClass.VehicleTypes.hatchback;
import lldDesignPatterns.StrategyDP.VehicleClass.VehicleTypes.sedan;
import lldDesignPatterns.StrategyDP.VehicleClass.VehicleTypes.suv;

public class Main {
    public static void main(String[] args) {
        
        Vehicle hatch = new hatchback();
        Vehicle suv =  new suv();
        Vehicle sedan = new sedan();

        hatch.drive();
        System.out.println("");
        suv.drive();
        System.out.println("");
        sedan.drive();
        System.out.println("");
    }
}
