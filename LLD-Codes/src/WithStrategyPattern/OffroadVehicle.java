package WithStrategyPattern;

public class OffroadVehicle extends Vehicle{

    OffroadVehicle(){
        super(new SpecialDriveStrategy());
    }

}
