import java.io.*;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        SortedApplianceList applianceList = new SortedApplianceList();

        // Reading appliances from the input file
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            while (scanner.hasNext()) {
                String type = scanner.next();
                int serialNumber = scanner.nextInt();
                double price = scanner.nextDouble();

                switch (type) {
                    case "Refrigerator":
                        double cubicFeet = scanner.nextDouble();
                        applianceList.add(new Refrigerator(serialNumber, price, cubicFeet));
                        break;
                    case "Dishwasher":
                        boolean undercounter = scanner.nextBoolean();
                        applianceList.add(new Dishwasher(serialNumber, price, undercounter));
                        break;
                    case "Microwave":
                        int watts = scanner.nextInt();
                        applianceList.add(new Microwave(serialNumber, price, watts));
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }

        ApplianceGUI.displayAppliances(applianceList);
    }
}
