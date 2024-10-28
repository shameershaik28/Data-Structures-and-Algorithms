package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public void reverse(int[] arr, int start, int end) {
        int N = arr.length;
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
        int C = B%N;

        reverse(A,0,N-1);
        reverse(A,0,B-1);
        reverse(A,B,N-1);

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
