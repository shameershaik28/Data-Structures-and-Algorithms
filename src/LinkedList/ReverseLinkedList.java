package LinkedList;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
public class ReverseLinkedList {
    public ListNode reverseList(ListNode A) {
        ListNode rh = null;

        while (A != null) {
            ListNode temp = A;
            A = A.next;
            temp.next = rh;
            rh = temp;
        }
        return rh;
    }
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        System.out.print("Original list: ");
        printList(head);

        // Reverse the list
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed list
        System.out.print("Reversed list: ");
        printList(reversedHead);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
