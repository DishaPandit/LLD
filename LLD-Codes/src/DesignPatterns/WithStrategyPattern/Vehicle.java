package DesignPatterns.WithStrategyPattern;

public class Vehicle {

    DriveStrategy driveObject;

    //constructor injection
    Vehicle(DriveStrategy obj){
        this.driveObject = obj;
    }

    public void drive(){
        driveObject.drive();
    }
}
