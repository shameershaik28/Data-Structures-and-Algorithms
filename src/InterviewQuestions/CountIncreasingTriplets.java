package InterviewQuestions;

import java.util.Scanner;

public class CountIncreasingTriplets {
    public int solve(int[] A) {
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int Left_count=0;
            //left traversing
            for(int j=i-1;j>=0;j--)
            {
                if((A[j]<A[i]))
                    Left_count++;
            }

            int Right_count=0;
            //Right traversing
            for(int j=i+1;j<n;j++)
            {
                if((A[j]>A[i]))
                    Right_count++;
            }
            count = count + (Left_count * Right_count);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        CountIncreasingTriplets c = new CountIncreasingTriplets();
        int ans = c.solve(arr);
        System.out.println("The number of triplets are :"+ans);
    }
}
