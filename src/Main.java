import builders.CarBuilder;
import cars.Car;
import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import factory.CarFactory;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        CarBuilder carBuilder = new CarBuilder();
//        carBuilder.setCarType(CarType.CITY_CAR);
//        carBuilder.setSeats(5);
//        carBuilder.setEngine(new Engine(2.0, 0));
//        carBuilder.setIsNew(true);
//        carBuilder.setGpsNavigator(new GPSNavigator("Odessa"));
//        carBuilder.setTransmission(Transmission.MANUAL);
//
//        Car car = carBuilder.build();
//        System.out.println(car);

        CarBuilder carBuilder = new CarBuilder();
        CarFactory carFactory = new CarFactory();

        carFactory.buildCityCar(carBuilder);
        Car cityCar = carBuilder.build();
        System.out.println(cityCar);

        carFactory.buildSportCar(carBuilder);
        Car sportCar = carBuilder.build();
        System.out.println(sportCar);

        carFactory.buildSUVCar(carBuilder);
        Car suvCar = carBuilder.build();
        System.out.println(suvCar);
    }
}
