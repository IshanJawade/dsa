package lldDesignPatterns.DecoratorDP.ToppingsDecorator.Toppings;

import lldDesignPatterns.DecoratorDP.BasePizza.BasePizza;
import lldDesignPatterns.DecoratorDP.ToppingsDecorator.ToppingDecorator;

public class VeggiCombo extends ToppingDecorator{

    BasePizza basePizaa;

    public VeggiCombo(BasePizza pizza){
        this.basePizaa = pizza;
    }

    @Override
    public int price(){
        return this.basePizaa.price() + 40;
    }
}
