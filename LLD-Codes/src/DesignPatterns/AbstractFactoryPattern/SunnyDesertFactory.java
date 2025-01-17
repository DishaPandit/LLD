package DesignPatterns.AbstractFactoryPattern;

public class SunnyDesertFactory implements  TerrainFactory{

    public Background createBackground() {
        return new SunnyDesertBackground();
    }
    public Road createRoad() {
        return new SunnyDesertRoad();
    }
    public Vehicle createVehicle() {
        return new SunnyDesertVehicle();
    }

}
