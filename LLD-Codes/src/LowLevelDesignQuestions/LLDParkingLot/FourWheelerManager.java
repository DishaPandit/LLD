package LowLevelDesignQuestions.LLDParkingLot;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{

    List<ParkingSpot> list;
    public FourWheelerManager() {
        super(List.of(new NearElevatorStrategy()));
    }
}
