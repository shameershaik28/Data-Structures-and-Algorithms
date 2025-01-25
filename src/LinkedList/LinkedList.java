package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node head = null;

    public static void insert_node(int position, int value) {
        Node nn = new Node(value);
        if (position == 1) {
            nn.next = head;
            head = nn;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
        }
    }

    public static void delete_node(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null)
                temp.next = temp.next.next;
        }
    }

    public static void print_ll() {
        Node temp = head;
        if (temp == null) return;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        // Test insert_node
        insert_node(1, 10); // Insert 10 at position 1
        insert_node(2, 20); // Insert 20 at position 2
        insert_node(3, 30); // Insert 30 at position 3
        insert_node(2, 15); // Insert 15 at position 2

        // Print the linked list
        System.out.print("Linked list after insertions: ");
        print_ll(); // Expected output: 10 15 20 30
        System.out.println();

        // Test delete_node
        delete_node(2); // Delete node at position 2
        System.out.print("Linked list after deletion: ");
        print_ll(); // Expected output: 10 20 30
        System.out.println();

        // Test more insertions and deletions
        insert_node(1, 5); // Insert 5 at position 1
        delete_node(4);    // Delete node at position 4
        System.out.print("Linked list after more operations: ");
        print_ll(); // Expected output: 5 10 20
        System.out.println();
    }
}
