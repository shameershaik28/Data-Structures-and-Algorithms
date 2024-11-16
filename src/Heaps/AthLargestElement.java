package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AthLargestElement {
    public int[] solve(int A, int[] B) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < B.length; i++) {
            heap.add(B[i]);
            if (heap.size() < A) B[i] = -1;
            else {
                if (heap.size() > A) {
                    heap.poll();
                }
                B[i] = heap.peek();
            }
        }
        return B;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element A: ");
        int A = sc.nextInt();

        AthLargestElement obj = new AthLargestElement();
        int[] ans = obj.solve(A, arr);
        System.out.println(Arrays.toString(ans));
    }
}
