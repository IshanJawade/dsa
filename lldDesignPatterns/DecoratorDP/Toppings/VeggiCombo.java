package lldDesignPatterns.DecoratorDP.Toppings;

import lldDesignPatterns.DecoratorDP.Pizza.BasePizza;

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
