package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

//Bruce-Force Approach
public class SumofAllSubarrays {
    public long subarraySum(int[] A) {
        int N = A.length;
        long ans = 0;
        for(int s=0; s<N; s++){
            int sum =0;
            for(int e=s; e<N; e++){
                   sum+=A[e];
                   ans+=sum;
               }
            }
        return ans;
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
