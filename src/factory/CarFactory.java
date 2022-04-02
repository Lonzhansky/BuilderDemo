package factory;

import builders.Builder;
import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;

public class CarFactory {

    public void buildSportCar(Builder builder) {
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(6.3, 0));
        builder.setIsNew(true);
        builder.setGpsNavigator(new GPSNavigator());
        builder.setTransmission(Transmission.AUTO);
    }

    public void buildCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.6, 0));
        builder.setIsNew(true);
        builder.setGpsNavigator(new GPSNavigator());
        builder.setTransmission(Transmission.MANUAL);
    }

    public void buildSUVCar(Builder builder) {
        builder.setCarType(CarType.SVU);
        builder.setSeats(7);
        builder.setEngine(new Engine(3.0, 0));
        builder.setIsNew(true);
        builder.setGpsNavigator(new GPSNavigator("Kiev"));
        builder.setTransmission(Transmission.AUTO);
    }
}
