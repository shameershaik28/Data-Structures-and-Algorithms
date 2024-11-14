package Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ConnectRopes {
    public int solve(int[] A) {
        int N = A.length;
        int count =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(A[i]);
        }

        while(pq.size() > 1) {
            int a= pq.peek();
            pq.remove();
            int b = pq.peek();
            pq.remove();
            count+= a+b;
            pq.add(a+b);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        ConnectRopes c = new ConnectRopes();
        int ans=c.solve(A);
        System.out.println(ans);
    }
}
