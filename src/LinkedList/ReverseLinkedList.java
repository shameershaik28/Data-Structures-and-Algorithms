package LinkedList;

public class ReverseLinkedList {

        // Definition for the ListNode class
        static class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
                next = null;
            }
        }

        // Method to reverse the linked list
        public ListNode reverseList(ListNode A) {
            ListNode rh = null; // Initialize the reversed head to null.

            while (A != null) {
                ListNode temp = A; // Store the current node.
                A = A.next;        // Move to the next node.
                temp.next = rh;    // Point the current node to the reversed list.
                rh = temp;         // Update the reversed head.
            }
            return rh; // Return the reversed list.
        }

        // Helper method to print the linked list
        public static void printList(ListNode head) {
            while (head != null) {
                System.out.print(head.val + " -> ");
                head = head.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            System.out.println("Original list:");
            printList(head);

            // Reverse the linked list
            ReverseLinkedList solution = new ReverseLinkedList();
            ListNode reversedHead = solution.reverseList(head);

            System.out.println("Reversed list:");
            printList(reversedHead);
        }
    }
