package Queues;

import java.util.*;

public class QueueUsingStacks {
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    // Constructor
    QueueUsingStacks() {
    }

    static void push(int X) {
        st1.push(X);
    }

    static int pop() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.isEmpty() ? -1 : st2.pop();
    }

    static int peek() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.isEmpty() ? -1 : st2.peek();
    }

    static boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();

        System.out.println("Enter operations: push <num>, pop, peek, empty, exit");
        while (true) {
            String operation = scanner.next();
            if (operation.equals("push")) {
                int value = scanner.nextInt();
                queue.push(value);
                System.out.println("Pushed: " + value);
            } else if (operation.equals("pop")) {
                System.out.println("Popped: " + queue.pop());
            } else if (operation.equals("peek")) {
                System.out.println("Front element: " + queue.peek());
            } else if (operation.equals("empty")) {
                System.out.println("Is empty: " + queue.empty());
            } else if (operation.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid operation!");
            }
        }
        scanner.close();
    }
}
