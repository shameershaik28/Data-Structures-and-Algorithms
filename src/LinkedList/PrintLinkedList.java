package LinkedList;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x)
    {
        val = x;
        next = null;
    }
}
public class PrintLinkedList {
        public void solve(ListNode A) {
            if(A == null)
                return;

            ListNode temp = A;

            while(temp != null)
            {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            // Create nodes
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(3);

            // Link the nodes
            node1.next = node2;
            node2.next = node3;

            // Head of the linked list
            ListNode head = node1;

            // Create an instance of Solution and call the solve method
            PrintLinkedList solution = new PrintLinkedList();
            solution.solve(head); // Output should be: 1 2 3
        }
}
