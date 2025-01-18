package LowLevelDesignQuestions.LLDParkingLot;

import DesignPatterns.NullObjectDesignPattern.Vehicle;

public class FourWheelerSpot extends ParkingSpot {
    public FourWheelerSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, price);
    }

    public int getPrice() {
        return 20;
    }
}
