package BuilderPattern.builders;

import BuilderPattern.cars.CarType;
import BuilderPattern.components.Engine;
import BuilderPattern.components.GPSNavigator;
import BuilderPattern.components.Transmission;
import BuilderPattern.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GPSNavigator gpsNavigator);    
}