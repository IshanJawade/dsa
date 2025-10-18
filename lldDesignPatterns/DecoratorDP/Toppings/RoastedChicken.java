package lldDesignPatterns.DecoratorDP.Toppings;

import lldDesignPatterns.DecoratorDP.Pizza.BasePizza;

public class RoastedChicken extends ToppingDecorator{

    BasePizza basePizaa;

    public RoastedChicken(BasePizza pizza){
        this.basePizaa = pizza;
    }

    @Override
    public int price(){
        return this.basePizaa.price() + 50;
    }
}
