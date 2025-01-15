package AbstractFactoryPattern;

// Concrete Products for Sunny Desert Terrain
public class SunnyDesertBackground implements  Background{
    @Override
    public void render() {
        System.out.println("Rendering Sunny Desert Background");
    }
}
