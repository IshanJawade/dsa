package lldDesignPatterns.DecoratorDP.Toppings;

import lldDesignPatterns.DecoratorDP.Pizza.BasePizza;

public class ExtraChesse extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraChesse(BasePizza pizaa){
        this.basePizza = pizaa;
    }

    @Override
    public int price(){
        return this.basePizza.price() + 40;
    }
}
