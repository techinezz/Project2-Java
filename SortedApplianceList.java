public class SortedApplianceList extends ApplianceList {
    public void add(Appliance appliance) {
        ApplianceNode newNode = new ApplianceNode(appliance);

        if (first == null || first.data.getSerialNumber() > appliance.getSerialNumber()) {
            newNode.next = first;
            first = newNode;
        } else {
            ApplianceNode current = first;
            while (current.next != null && current.next.data.getSerialNumber() < appliance.getSerialNumber()) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        length++;
    }
}
