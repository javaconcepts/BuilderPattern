package BuilderPattern.cars;

import BuilderPattern.components.Engine;
import BuilderPattern.components.GPSNavigator;
import BuilderPattern.components.Transmission;
import BuilderPattern.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
            GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print(){
        String info = "";
        info+= "Type of car: " + carType + "\n";
        return info;
    }

}
