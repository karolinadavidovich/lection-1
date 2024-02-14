package HM6;

public class AirlineArray {
    private Airline[] transports;

    public AirlineArray(Airline[] transports) {
        this.transports = transports;
    }

    public double getTotalCapacity() {
        double totalCapacity = 0;
        for (Airline transport : transports) {
            totalCapacity += transport.getCapacity();
        }
        return totalCapacity;
    }

    public double getTotalLoadCapacity() {
        double totalLoadCapacity = 0;
        for (Airline transport : transports) {
            totalLoadCapacity += transport.getLoadCapacity();
        }
        return totalLoadCapacity;
    }

    public double sortRangeOfFlight() {
        for (Airline transport : transports) {

        }
        return sortRangeOfFlight();
    }
}

