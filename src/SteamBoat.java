import abstracts.Mechanical;
import abstracts.WaterTransport;

public class SteamBoat extends WaterTransport implements Mechanical {

    private String typeEngine;

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public SteamBoat(String name, boolean seaType) {
        super(name, seaType);
    }

    @Override
    public void addFuel() {

    }

}