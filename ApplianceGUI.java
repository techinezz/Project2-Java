import javax.swing.*;
import java.awt.*;

public class ApplianceGUI {
    public static void displayAppliances(SortedApplianceList list) {
        JFrame frame = new JFrame("Appliance Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea displayArea = new JTextArea();
        ApplianceNode current = list.first;
        while (current != null) {
            displayArea.append(current.data.toString() + "\n");
            current = current.next;
        }

        frame.add(new JScrollPane(displayArea));
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
