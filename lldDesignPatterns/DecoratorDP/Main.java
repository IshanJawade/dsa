package lldDesignPatterns.DecoratorDP;

import lldDesignPatterns.DecoratorDP.Pizza.BasePizza;
import lldDesignPatterns.DecoratorDP.Pizza.Margherita;
import lldDesignPatterns.DecoratorDP.Pizza.Peperoni;
import lldDesignPatterns.DecoratorDP.Toppings.ExtraChesse;
import lldDesignPatterns.DecoratorDP.Toppings.RoastedChicken;
import lldDesignPatterns.DecoratorDP.Toppings.VeggiCombo;

public class Main {
    public static void main(String[] args) {

    // Type 1    

        // Take base pizaa  -> Margherita = 100
        BasePizza pizza = new Margherita();

        // Add Toppings

        // 1) Rosted chicken = 50
        pizza = new RoastedChicken(pizza);
        // 2) VeggiCombo = 40
        pizza = new VeggiCombo(pizza); 

        // Print the total price = 190
        System.out.println("Pizza 1: Rs." + pizza.price());

    // Type 2

        // Every object is craeted in one statement
        BasePizza pizza1 = new RoastedChicken( new ExtraChesse( new Peperoni() ) );
        
        System.out.println("Pizza 2: Rs." + pizza1.price());

    }
}
