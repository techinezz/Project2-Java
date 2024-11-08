public abstract class ApplianceList {
    protected ApplianceNode first;
    protected int length;

    public ApplianceList() {
        first = null;
        length = 0;
    }

    public void append(Appliance appliance) {
        ApplianceNode newNode = new ApplianceNode(appliance);
        if (first == null) {
            first = newNode;
        } else {
            ApplianceNode current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void display() {
        ApplianceNode current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

