package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

//Sliding window Technique Approach
public class MaximumSubarraySumOfFixedLength {
    public long solve(int[] A, int B) {
        int N = A.length;
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < B; i++){
            sum += A[i];
        }
        max = Math.max(max, sum);
        int s = 0, e = B;  // start of window is 0, end is B
        while (e < N) {
            sum = sum - A[s]+ A[e];
            max = Math.max(max, sum);
            s++;
            e++;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the  array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the B:");
        int B = sc.nextInt();

        MaximumSubarraySumOfFixedLength s = new MaximumSubarraySumOfFixedLength();
        long ans = s.solve(A, B);
        System.out.println(ans);

    }

}
