package DesignPatterns.DecoratorPattern;

public class Mushroom extends ToppingDecorator{

    //is-a BasePizza
    //has-a BasePizza

    BasePizza basePizza;

    public Mushroom(BasePizza pizza){
        this.basePizza = pizza;
    }


    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
