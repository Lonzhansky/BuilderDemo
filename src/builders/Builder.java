package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGpsNavigator(GPSNavigator gpsNavigator);
    void setIsNew(boolean isNew);
}
