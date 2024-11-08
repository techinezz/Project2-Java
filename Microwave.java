public class Microwave extends Appliance {
    private int watts;

    public Microwave(int serialNumber, double price, int watts) {
        super(serialNumber, price);
        this.watts = watts;
    }

    @Override
    public String toString() {
        return "Microwave - Serial: " + serialNumber + ", Price: $" + price + ", Watts: " + watts;
    }
}
