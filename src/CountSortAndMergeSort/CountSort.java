package CountSortAndMergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    public int[] solve(int[] A) {
        int N = A.length;
        int max = A[0];

        // find the max number
        for(int i = 1;i<A.length;i++){
            max = Math.max(A[i],max);
        }
     // create frequency array of size max+1 to store numbers till max
        int[] frequency = new int[max+1];
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int val = A[i];
            frequency[val]++;
        }

        //Iterate on Frequency and create an ans[]
        int K=0;
        for (int i = 0; i <=max; i++) {
            int freq = frequency[i];
            for(int j=0;j<freq;j++){
                ans[K]= i;
                K++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        CountSort cs = new CountSort();
        int[] ans = cs.solve(A);
        System.out.println(Arrays.toString(ans));
    }
}
