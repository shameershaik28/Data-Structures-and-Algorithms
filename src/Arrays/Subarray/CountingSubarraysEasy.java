package Arrays.Subarray;

import java.util.Scanner;

public class CountingSubarraysEasy {
    public int solve(int[] A, int B) {
        int N = A.length;
        int count = 0;
        for(int i =0; i<N ; i++)
        {
            int sum =0;
            for(int j =i; j<N; j++)
            {
                sum += A[j];
                if(sum<B)
                {
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Enter the B value");
        int B = in.nextInt();

        CountingSubarraysEasy obj = new CountingSubarraysEasy();
        int ans = obj.solve(A, B);
        System.out.println(ans);
    }
}
