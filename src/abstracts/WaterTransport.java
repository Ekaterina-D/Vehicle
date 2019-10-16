package abstracts;

public abstract class WaterTransport extends Vehicle {

    private boolean seaType;

    public boolean isSeaType() {
        return seaType;
    }

    public void setSeaType(boolean seaType) {
        this.seaType = seaType;
    }

    public WaterTransport(String name, boolean seaType) {
        super(name);
        this.seaType = seaType;
    }

}