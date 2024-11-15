package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ElementsRemoval {
    //This function reverse the array
    public void reverse(int[] A)
    {
        int N = A.length;
        int s=0;
        int e=N-1;
        while(s<e)
        {
        int temp = A[s];
        A[s]= A[e];
        A[e]= temp;
        s++;
        e--;
    }
    }
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);// It will first sort the array
        System.out.println(Arrays.toString(A));
        reverse(A); //It will call the reverse function
        System.out.println(Arrays.toString(A));
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum + A[i]*(i+1);
        }
        return sum;
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

        ElementsRemoval obj = new ElementsRemoval();
        int ans = obj.solve(A);
        System.out.println(ans);

    }
}
