package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public void reverse(int[] arr, int start, int end) {
        int s = start;
        int e =end;
        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public int[] solve(int[] A, int B) {
        int N = A.length;

        // Handle empty array case
        if (N == 0) return A;

        // If B is 0 or a multiple of N, no rotation is needed
        B = B % N;
        if (B == 0) return A;

        // Reverse the entire array
        reverse(A, 0, N - 1);

        // Reverse the first part (0 to B-1)
        reverse(A, 0, B - 1);

        // Reverse the second part (B to N-1)
        reverse(A, B, N - 1);

        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int N = sc.nextInt();
        System.out.println("Enter the number B:");
        int B = sc.nextInt();

        int[] A = new int[N];
System.out.println("Enter the elements of array:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        ArrayRotation a  = new ArrayRotation();
        System.out.println(Arrays.toString(a.solve(A, B)));
    }
}
