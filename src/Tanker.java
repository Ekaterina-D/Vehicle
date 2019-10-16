import abstracts.Mechanical;
import abstracts.WaterTransport;

public class Tanker extends WaterTransport implements Mechanical {

    private int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Tanker(String name, boolean seaType) {
        super(name, seaType);
    }

    @Override
    public void addFuel() {

    }

}