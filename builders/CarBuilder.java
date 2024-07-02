package BuilderPattern.builders;

import BuilderPattern.cars.Car;
import BuilderPattern.cars.CarType;
import BuilderPattern.components.Engine;
import BuilderPattern.components.GPSNavigator;
import BuilderPattern.components.Transmission;
import BuilderPattern.components.TripComputer;

public class CarBuilder implements Builder {
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
    
    public Car getResult(){
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
