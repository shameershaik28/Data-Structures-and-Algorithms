package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

//Prefix sum Approach
public class SumofAllSubarrays {
   public long subarraySum(int[] A) {
       int N = A.length;
       long total = 0;
       int[] pf= new int[N];
       pf[0]=A[0];

       for(int i=1;i<N;i++)
       {
           pf[i]=pf[i-1]+A[i];
       }

       for(int s=0;s<N;s++)
       {
           for(int e=s;e<N;e++)
           {
              long sum = (s==0) ? pf[e] : pf[e] - pf[s-1];
              total += sum;
           }
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
