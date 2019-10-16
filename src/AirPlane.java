import abstracts.AirTransport;
import abstracts.Mechanical;

public class AirPlane extends AirTransport implements Mechanical {

    private int capacityPeople;

    public int getCapacityPeople() {
        return capacityPeople;
    }

    public void setCapacityPeople(int capacityPeople) {
        this.capacityPeople = capacityPeople;
    }

    public AirPlane(String name, int maximumFlightAltitude) {
        super(name, maximumFlightAltitude);
    }

    @Override
    public void addFuel() {

    }

}
