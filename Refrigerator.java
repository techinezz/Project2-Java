public class Refrigerator extends Appliance {
    private double cubicFeet;

    public Refrigerator(int serialNumber, double price, double cubicFeet) {
        super(serialNumber, price);
        this.cubicFeet = cubicFeet;
    }

    @Override
    public String toString() {
        return "Refrigerator - Serial: " + serialNumber + ", Price: $" + price + ", Cubic Feet: " + cubicFeet;
    }
}
