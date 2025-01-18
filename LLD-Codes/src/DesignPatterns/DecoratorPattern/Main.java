package DesignPatterns.DecoratorPattern;

public class Main {

    public static void main(String[] args) {

        BasePizza pizza1 = new PeppyPaneer();
        System.out.println("Peppy Paneer : Rs."+pizza1.cost() );

        BasePizza pizza2 = new ExtraCheese(new PeppyPaneer());
        System.out.println("Peppy Paneer + extra cheese : Rs."+pizza2.cost() );

        BasePizza pizza3 = new Mushroom(new ExtraCheese(new PeppyPaneer()));
        System.out.println("Peppy Paneer + extra cheese + mushroom: Rs."+pizza3.cost() );

    }
}
