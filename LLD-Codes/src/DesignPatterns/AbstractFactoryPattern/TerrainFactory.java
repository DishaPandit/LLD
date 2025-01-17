package DesignPatterns.AbstractFactoryPattern;

public interface TerrainFactory {

    Background createBackground();
    Road createRoad();
    Vehicle createVehicle();
}
