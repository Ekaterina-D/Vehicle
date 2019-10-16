import abstracts.AirTransport;
import abstracts.NotMechanical;

public class Aerostat extends AirTransport implements NotMechanical {

    public int getCapacityBall() {
        return capacityBall;
    }

    public void setCapacityBall(int capacityBall) {
        this.capacityBall = capacityBall;
    }

    private int capacityBall;

    public Aerostat(String name, int maximumFlightAltitude) {
        super(name, maximumFlightAltitude);
    }

    @Override
    public void makeAnEffort() {

    }

}
