package cars;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private double fuel;
    private boolean isNew;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, GPSNavigator gpsNavigator,boolean isNew) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.isNew = isNew;
    }

    public void go() {
        System.out.println("car go");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine volume=" + engine.getVolume() +
                ", transmission=" + transmission +
                ", gpsNavigator route=" + gpsNavigator.getRoute() +
                ", fuel=" + fuel +
                ", isNew=" + isNew +
                '}';
    }
}
