package AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {
        // Choose a factory based on user preference or criteria
        TerrainFactory factory = new RainyMountainFactory();

        Background background = factory.createBackground();
        Road road = factory.createRoad();
        Vehicle vehicle = factory.createVehicle();

        // Render the objects
        background.render();
        road.render();
        vehicle.render();
    }
}
