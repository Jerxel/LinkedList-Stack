public class LinkedList {
    Node head;

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    //Add a new node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    //Display the linked list
    public void displayList() {
        System.out.print("List (head -> tail): ");
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        System.out.println("Adding 30 to the front...");
        myList.addFirst(30);
        myList.displayList();

        System.out.println("Adding 20 to the front...");
        myList.addFirst(20);
        myList.displayList();

        System.out.println("Adding 10 to the front...");
        myList.addFirst(10);
        myList.displayList();
    }
}