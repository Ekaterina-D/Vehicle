import abstracts.Mechanical;
import abstracts.TerrestrialTransport;

public class Car extends TerrestrialTransport implements Mechanical {

    private int amountDoor;

    public int getAmountDoor() {
        return amountDoor;
    }

    public void setAmountDoor(int amountDoor) {
        this.amountDoor = amountDoor;
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void addFuel() {

    }

}
