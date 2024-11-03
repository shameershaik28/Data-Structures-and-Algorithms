package Subarray;

import java.util.Scanner;

public class SubarraySums
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
        int N = sc.nextInt();

        if(N<=0 || N>1000) return;

        int[] A = new int[N];
System.out.println("Enter the elements of array");
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++)
        {
            int sum =0;
            for(int j = i; j < N; j++)
            {
                sum=sum +A[j];
                System.out.print(sum+" ");
            }
        }
    }
}
