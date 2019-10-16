package abstracts;

public abstract class AirTransport extends Vehicle {

    private int maximumFlightAltitude;

    public int getMaximumFlightAltitude() {
        return maximumFlightAltitude;
    }

    public void setMaximumFlightAltitude(int maximumFlightAltitude) {
        this.maximumFlightAltitude = maximumFlightAltitude;
    }

    public AirTransport(String name, int maximumFlightAltitude) {
        super(name);
        this.maximumFlightAltitude = maximumFlightAltitude;
    }

}