import abstracts.NotMechanical;
import abstracts.TerrestrialTransport;

public class Bike extends TerrestrialTransport implements NotMechanical {

    private int amountWheel;
    private Chain chain = new Chain("lightweight", 1000);

    public Bike(String name, int amountWheel) {
        super(name);
        this.amountWheel = amountWheel;
    }

    public int getAmountWheel() {
        return amountWheel;
    }

    public void setAmountWheel(int amountWheel) {
        this.amountWheel = amountWheel;
    }

    @Override
    public void makeAnEffort() {

    }

    private class Chain {

        private String typeChain;
        private int amountStar;

        public Chain(String typeChain, int amountStar) {
            this.typeChain = typeChain;
            this.amountStar = amountStar;
        }

        public String getTypeChain() {
            return typeChain;
        }

        public void setTypeChain(String typeChain) {
            this.typeChain = typeChain;
        }

        public int getAmountStar() {
            return amountStar;
        }

        public void setAmountStar(int amountStar) {
            this.amountStar = amountStar;
        }

    }

}
