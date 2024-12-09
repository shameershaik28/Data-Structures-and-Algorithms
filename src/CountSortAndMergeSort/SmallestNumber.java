package CountSortAndMergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
    public int[] smallestNumber(int[] A) {
        int N = A.length;
        int[] far = new int[10];
        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            int val = A[i];
            far[val]++;
        }

        //Iterate on Frequency and create an ans[]
        int K=0;
        for (int i = 0; i <10; i++) {
            int freq = far[i];
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

        SmallestNumber s = new SmallestNumber();
        int[] ans = s.smallestNumber(A);
        System.out.println(Arrays.toString(ans));

    }
}
