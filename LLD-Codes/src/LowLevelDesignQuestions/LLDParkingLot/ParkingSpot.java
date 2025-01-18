package LowLevelDesignQuestions.LLDParkingLot;

import DesignPatterns.NullObjectDesignPattern.Vehicle;

public class ParkingSpot {

    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    public ParkingSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isEmpty = false;
    }

    public void removeVehicle(){
        vehicle = null;
        isEmpty = true;
    }
}
