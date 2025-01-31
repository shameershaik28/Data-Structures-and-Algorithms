package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumbers {
    public String solve(int A) {
        // In Java, you can create a Queue object using one of the implementations provided in
        // the Java Collections Framework. One commonly used implementation is the LinkedList class,
        // which can function as a Queue.
        Queue<String> q = new LinkedList<>();

        if (A == 1) {
            return "11";
        }
        if (A == 2) {
            return "22";
        }

        q.add("1");
        q.add("2");

        for (int i = 1; i < A; i++) {
            String x = q.poll();
            String a = x + "1";
            String b = x + "2";
            q.add(a);
            q.add(b);
        }

        String ans1 = q.poll();
        StringBuilder sb = new StringBuilder(ans1);
        sb.reverse();
        String ans2 = sb.toString();

        return ans1 + ans2;
    }

    public static void main(String[] args) {
        PerfectNumbers solution = new PerfectNumbers();

        // Test the solve method with different values of A
        System.out.println(solution.solve(1));  // Expected output: "11"
        System.out.println(solution.solve(2));  // Expected output: "22"
        System.out.println(solution.solve(3));  // Expected output: "121"
        System.out.println(solution.solve(4));  // Expected output: "1221"
        System.out.println(solution.solve(5));  // Expected output: "12121"
    }
}

