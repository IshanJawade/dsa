package lldDesignPatterns.strategyDP;

import lldDesignPatterns.strategyDP.Vehicle.Vehicle;

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
