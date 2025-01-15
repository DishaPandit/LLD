package AbstractFactoryPattern;

public interface TerrainFactory {

    Background createBackground();
    Road createRoad();
    Vehicle createVehicle();
}
