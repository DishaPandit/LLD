package LowLevelDesignQuestions.LLDParkingLot;

import DesignPatterns.NullObjectDesignPattern.Vehicle;

public class TwoWheelerSpot extends ParkingSpot {
    public TwoWheelerSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, price);
    }

    public int getPrice() {
        return 10;
    }
}
