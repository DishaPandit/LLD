package DesignPatterns.NullObjectDesignPattern;

public class Main {

    public static void main(String[] args) {

        //if you pass any object other than Car, it will return NullVehicle object and give default behaviour
        //So we removed null check here using null object pattern
        Vehicle vehicle =  VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);

        Vehicle vehicle2 =  VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle2);
    }

    private static void printVehicleDetails(Vehicle vehicle) {

        System.out.println("Seating capacity : " + vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank capacity : " + vehicle.getTankCapacity());
    }
}
