package DesignPatterns.WithStrategyPattern;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SpecialDriveStrategy());

    }
}
