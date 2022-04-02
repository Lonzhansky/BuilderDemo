package components;

public class Engine {
    private double volume;
    private double miles;
    private boolean isStarted;

    public Engine(double volume, double miles) {
        this.volume = volume;
        this.miles = miles;
    }

    public double getVolume() {
        return volume;
    }

    public double getMiles() {
        return miles;
    }

    public boolean isStarted() {
        return isStarted;
    }
}
