package BuilderPattern.director;

import BuilderPattern.cars.CarType;
import BuilderPattern.components.Engine;
import BuilderPattern.components.GPSNavigator;
import BuilderPattern.components.Transmission;
import BuilderPattern.components.TripComputer;
import BuilderPattern.builders.Builder;

/* 
 * Director defines the order if building steps.
 * It works with a builder object through common 
 * builder interface. 
 * Therefore it may not know what product is being 
 * built.
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator());
    }
}
