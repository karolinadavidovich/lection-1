package HM6;

public class Main1 {
    public static void main(String[] args) {
        Airplanes airplanes = new Airplanes(250, 1000, 500);
        System.out.println(airplanes);
        Helicopters helicopters = new Helicopters(150, 800, 200);
        System.out.println(helicopters);
        Quadcopters quadcopters = new Quadcopters(50, 20, 150);
        System.out.println(quadcopters);

        Airline[] transports = new Airline[]{airplanes, helicopters, quadcopters};
        AirlineArray airlineArray = new AirlineArray(transports);
        System.out.println("Total capacity= " + airlineArray.getTotalCapacity());
        System.out.println("Total load capacity= " + airlineArray.getTotalLoadCapacity());
        //System.out.println(airlineArray.sortRangeOfFlight());
    }
}
