package DesignPatterns.AbstractFactoryPattern;

public class RainyMountainRoad implements  Road
{
    @Override
    public void render() {
        System.out.println("Rendering Slippery Mountain Roads");
    }
}
