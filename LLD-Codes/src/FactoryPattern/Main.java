package FactoryPattern;

public class Main {

    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();
        Shape s = sf.getShape("CIRCLE");
        s.draw();
    }
}
