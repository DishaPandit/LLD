package DesignPatterns.DecoratorPattern;

public class ExtraCheese extends ToppingDecorator{

    //is-a BasePizza
    //has-a BasePizza

    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }


    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
