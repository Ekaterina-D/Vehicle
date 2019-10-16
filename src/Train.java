import abstracts.Mechanical;
import abstracts.TerrestrialTransport;

public class Train extends TerrestrialTransport implements Mechanical {

    private double maxSpeed;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Train(String name) {
        super(name);
    }

    @Override
    public void addFuel() {

    }

}