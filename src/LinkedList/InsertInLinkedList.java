package LinkedList;

import java.util.Scanner;

/* class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
} */

public class InsertInLinkedList {
    public ListNode solve(ListNode A, int B, int C) {
        // Create the new node to be inserted
        ListNode n1 = new ListNode(B);

        // If inserting at the head (C == 0)
        if (C == 0) {
            n1.next = A;
            return n1; // Return the new head
        }

        // Traverse the list to find the node at position (C - 1)
        ListNode temp = A;
        for (int i = 0; i < C - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // If C is out of bounds, return the original list
        if (temp == null) {
            return A;
        }

        // Insert the new node after the node at position (C - 1)
        n1.next = temp.next;
        temp.next = n1;

        return A; // Return the head of the updated list
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        // Link the nodes
        node1.next = node2;
        node2.next = node3;

        // Head of the linked list
        ListNode head = node1;

        // Input the new value and position
        System.out.print("Enter value to insert: ");
        int B = sc.nextInt();
        System.out.print("Enter position to insert: ");
        int C = sc.nextInt();

        // Create an instance of Solution and call the solve method
        InsertInLinkedList solution = new InsertInLinkedList();
        ListNode updatedHead = solution.solve(head, B, C);

        System.out.print("Updated head: "+updatedHead.val  );
    }
}
