package Arrays.PrefixSum;

import java.util.Scanner;

public class RainWaterTrapped {
    public int trap(final int[] A) {
        int N = A.length;
        int ans =0; // final result
        int[] pSum = new int[N];
        pSum[0] = A[0];
        for(int i =1; i<N; i++){
            pSum[i]= Math.max(pSum[i-1], A[i]);
        }

        int[] sSum= new int[N];
         sSum[N-1] = A[N-1];
        for(int i =N-2; i>=0; i--){
            sSum[i]= Math.max(pSum[i+1], A[i]);
        }

        for(int i=0; i<N; i++){
            int left = pSum[i];
            int right = sSum[i];
            int min = Math.min(left,right);
            int amount = min -A[i];
            ans += amount;
        }
        return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        RainWaterTrapped solution = new RainWaterTrapped();
        int ans = solution.trap(A);
        System.out.println(ans);

    }
}