package Arrays.Subarrays;

import java.util.Scanner;

//Brute-Force Approach
public class GoodSubarraysEasy {
    public int solve(int[] A, int B) {
        int N = A.length;
        int ans =0;

        for(int s=0; s<N ;s++)
        {
            int sum =0;
            for(int e=s; e<N;e++)
            {
                sum+=A[e];
                int len = e-s+1;

                if(len%2==0 && sum<B|| len%2!=0 && sum >B)
                {
                    ans++;
                }
            }
        }
        return ans;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = in.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Enter the B:");
        int B = in.nextInt();

        GoodSubarraysEasy gs = new GoodSubarraysEasy();
        int ans = gs.solve(A, B);
        System.out.println(ans);
    }
}
