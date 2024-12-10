package CountSortAndMergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public int[] solve(final int[] A, final int[] B) {
        int N = A.length;
        int M = B.length;

        int i =0;
        int j = 0;
        int k = 0;

        int[] result = new int[N + M];

        while(i<N && j<M){
            if(A[i]<B[j]){
                result[k] = A[i];
                i++;
                k++;
            }
            else {
                result[k] = B[j];
                j++;
                k++;
            }
        }

        while(i<N){
            result[k] = A[i];
            i++;
            k++;

        }
        while(j<M){
            result[k] = B[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array A ");
        int N = sc.nextInt();
        System.out.println("Enter the size of array B ");
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        System.out.println("Enter the elements A ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the elements B ");
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
        int[] ans = obj.solve(A, B);
        System.out.println(Arrays.toString(ans));
    }
}
