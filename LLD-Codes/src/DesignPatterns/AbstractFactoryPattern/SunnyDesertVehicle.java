package DesignPatterns.AbstractFactoryPattern;

public class SunnyDesertVehicle implements Vehicle{
    @Override
    public void render() {
        System.out.println("Rendering Desert Vehicle Optimized for Sand");
    }
}
