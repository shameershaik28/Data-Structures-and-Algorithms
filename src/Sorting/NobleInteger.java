package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        if(A[n-1] == 0)
        {
            return 1;
        }

        for(int i = n-2; i >= 0; i--)
        {
            if(A[i]!=A[i+1])
            {
                if(A[i]==n-1-i)
                {
                    return 1;
                }
            }
        }
        return 0;
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

        NobleInteger obj = new NobleInteger();
        int ans = obj.solve(A);
        System.out.println(ans);

    }
}
