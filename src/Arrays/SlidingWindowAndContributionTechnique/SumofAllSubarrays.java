package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

//Contribution Technique Approach
public class SumofAllSubarrays {
    public long subarraySum(int[] A) {
        int N = A.length;
        long total = 0;

        for(int i = 0; i < N; i++) {
            // Calculate number of occurrences for the specific index
            long occ = (long)(i + 1) * (long)(N - i); // Use long to prevent overflow
            // Multiply the occurrences with the index element
            long contribution = (long) A[i] * occ; // Use long to handle larger numbers
            // Add the contribution into the total variable
            total += contribution;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        SumofAllSubarrays s = new SumofAllSubarrays();
        long ans = s.subarraySum(A);
        System.out.println(ans);

    }
}
