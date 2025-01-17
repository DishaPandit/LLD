package DesignPatterns.AbstractFactoryPattern;

// Concrete Products for Rainy Mountainous Terrain
public class RainyMountainBackground implements  Background{
    @Override
    public void render() {
        System.out.println("Rendering Rainy Mountain Background");
    }
}
