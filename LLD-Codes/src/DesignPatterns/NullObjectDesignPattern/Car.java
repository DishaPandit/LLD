package DesignPatterns.NullObjectDesignPattern;

public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 50;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
