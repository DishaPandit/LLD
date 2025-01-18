package LowLevelDesignQuestions.LLDParkingLot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{
    List<ParkingSpot> list;

    public TwoWheelerManager() {
        super(List.of(new NearEntranceStrategy()));

    }
}
