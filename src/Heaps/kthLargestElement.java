package Heaps;

import java.util.Arrays;
import java.util.Scanner;

public class kthLargestElement {
    //Approach 1:
    //Sort the array in descending order.
    //Return the element at the index k-1.
    public static int solve(int[] A, int K)
    {
        int N = A.length;
        // Sort the array in descending order
        Arrays.sort(A); // Sorts in ascending order
        // Access the kth largest element
        return A[N - K];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the K value");
        int K = sc.nextInt();
       int ans=  solve(arr, K);
        System.out.println("Kth largest element (by sorting): " + ans);
    }
}
