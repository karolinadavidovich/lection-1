package HM6;

public class Airline {

    private double capacity;

    private double loadCapacity;

    private double rangeOfFlight;


    public Airline(double capacity, double loadCapacity, double rangeOfFlight) {
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
        this.rangeOfFlight = rangeOfFlight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setRangeOfFlight(double rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    @Override
    public String toString() {
        return "FIRST.Airline{" +
                "capacity=" + capacity +
                ", loadCapacity=" + loadCapacity +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }
}


