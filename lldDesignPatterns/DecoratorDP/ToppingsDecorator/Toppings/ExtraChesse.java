package lldDesignPatterns.DecoratorDP.ToppingsDecorator.Toppings;

import lldDesignPatterns.DecoratorDP.BasePizza.BasePizza;
import lldDesignPatterns.DecoratorDP.ToppingsDecorator.ToppingDecorator;

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
