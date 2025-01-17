package DesignPatterns.AbstractFactoryPattern;

public class RainyMountainFactory implements  TerrainFactory{

    public Background createBackground() {
        return new RainyMountainBackground();
    }
    public Road createRoad() {
        return new RainyMountainRoad();
    }
    public Vehicle createVehicle() {
        return new RainyMountainVehicle();
    }
}
