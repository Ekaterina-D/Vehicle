import abstracts.AirTransport;
import abstracts.Mechanical;

public class AirShip extends AirTransport implements Mechanical {

    private int amountEngine;

    public int getAmountEngine() {
        return amountEngine;
    }

    public void setAmountEngine(int amountEngine) {
        this.amountEngine = amountEngine;
    }

    public AirShip(String name, int maximumFlightAltitude) {
        super(name, maximumFlightAltitude);
    }

    @Override
    public void addFuel() {

    }

}
