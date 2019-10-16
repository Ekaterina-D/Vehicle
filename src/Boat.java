import abstracts.NotMechanical;
import abstracts.WaterTransport;

public class Boat extends WaterTransport implements NotMechanical {

    private boolean haveSail;

    public boolean isHaveSail() {
        return haveSail;
    }

    public void setHaveSail(boolean haveSail) {
        this.haveSail = haveSail;
    }

    public Boat(String name, boolean seaType) {
        super(name, seaType);
    }

    @Override
    public void makeAnEffort() {

    }

}
