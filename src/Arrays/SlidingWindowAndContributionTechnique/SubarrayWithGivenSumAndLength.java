package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

public class SubarrayWithGivenSumAndLength {
    public int solve(int[] A, int B, int C) {
        int N = A.length;

        for(int i =0; i<N ; i++)
        {
            int sum =0;
            for(int j=i;j<N ;j++)
            {
                sum+=A[j];
                int len= j-i+1;

                if(len==B && sum==C)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter the length of the array");
        int B = scanner.nextInt();
        System.out.println("Enter the C sum");
        int C = scanner.nextInt();
        SubarrayWithGivenSumAndLength s = new SubarrayWithGivenSumAndLength();
        int ans = s.solve(A, B, C);
        System.out.println(ans);
    }

}
