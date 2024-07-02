package BuilderPattern;

import BuilderPattern.builders.CarBuilder;
import BuilderPattern.cars.Car;
import BuilderPattern.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();

        System.out.println(car.getCarType());
    }

}
