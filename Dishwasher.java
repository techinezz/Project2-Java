public class Dishwasher extends Appliance {
    private boolean undercounter;

    public Dishwasher(int serialNumber, double price, boolean undercounter) {
        super(serialNumber, price);
        this.undercounter = undercounter;
    }

    @Override
    public String toString() {
        return "Dishwasher - Serial: " + serialNumber + ", Price: $" + price + ", Undercounter: " + undercounter;
    }
}
