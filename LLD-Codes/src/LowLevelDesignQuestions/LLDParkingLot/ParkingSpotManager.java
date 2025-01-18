package LowLevelDesignQuestions.LLDParkingLot;

import java.util.List;

public abstract class ParkingSpotManager {

    //has-a ParkingSpot
    List<ParkingStrategy> list;

    public ParkingSpotManager(List<ParkingStrategy> parkingStrategy){
        this.list = parkingStrategy;
    }

    public void findParkingSpace(){

    }

    public void addParkingSapce(){

    }

    public void removeParkingSpace(){

    }

    public void parkVehicle(){

    }

    public void removeVehicle(){

    }
}
