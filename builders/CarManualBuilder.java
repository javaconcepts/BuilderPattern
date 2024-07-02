package BuilderPattern.builders;

import BuilderPattern.cars.CarType;
import BuilderPattern.cars.Manual;
import BuilderPattern.components.Engine;
import BuilderPattern.components.GPSNavigator;
import BuilderPattern.components.Transmission;
import BuilderPattern.components.TripComputer;

public class CarManualBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmissionl) {
        this.transmission = transmissionl;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
    
    public Manual getResult(){
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
