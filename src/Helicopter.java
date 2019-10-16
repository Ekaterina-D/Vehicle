import abstracts.AirTransport;
import abstracts.Mechanical;

public class Helicopter extends AirTransport implements Mechanical {

    private int amountBlade;

    public int getAmountBlade() {
        return amountBlade;
    }

    public void setAmountBlade(int amountBlade) {
        this.amountBlade = amountBlade;
    }

    public Helicopter(String name, int maximumFlightAltitude) {
        super(name, maximumFlightAltitude);
    }

    @Override
    public void addFuel() {

    }

}
