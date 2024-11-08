public abstract class Appliance implements Comparable<Appliance> {
    protected int serialNumber;
    protected double price;

    public Appliance(int serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public int compareTo(Appliance other) {
        return Integer.compare(this.serialNumber, other.serialNumber);
    }

    @Override
    public abstract String toString();
}
