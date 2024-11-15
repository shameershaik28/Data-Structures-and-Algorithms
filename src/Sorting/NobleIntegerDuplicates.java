package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class NobleIntegerDuplicates {
    public int solve(int[] A) {
       int n = A.length;
       int ans=0;  int c=0;
       Arrays.sort(A);
       if(A[0]==0)
       {
           ans++;
       }

       for(int i=1;i<n;i++)
       {
           if(A[i]!=A[i-1])
           {
               c=i;
           }

           if(c==A[i])
           {
               ans++;
           }
       }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        NobleIntegerDuplicates obj = new NobleIntegerDuplicates();
        int ans = obj.solve(arr);
        System.out.println(ans);
    }
}
