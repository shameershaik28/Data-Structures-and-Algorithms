package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

//Sliding window Technique
public class SubarrayWithLeastAverage {
    public int solve(int[] A, int B) {
        int N = A.length;
        int sum = 0;
        // Initial sum for the first window
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        int minSum = sum;
        int index = 0;
        int s=0, e=B;
        while(e<N)
        {
            sum = sum -A[s]+A[e];
            if (sum < minSum) {
                minSum = sum;
                index = s + 1;  // The starting index of the current window
            }
            s++;
            e++;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();

        SubarrayWithLeastAverage s = new SubarrayWithLeastAverage();
        int ans = s.solve(arr, B);
        System.out.println(ans);
    }
}
