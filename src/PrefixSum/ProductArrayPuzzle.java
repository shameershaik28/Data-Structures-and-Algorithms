package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int N = A.length;

        int[] output = new int[N];
       int[] prefixSum = new int[N];

       prefixSum[0] = A[0];
       for (int i = 1; i < N; i++) {
           prefixSum[i] = prefixSum[i - 1] * A[i];
       }

       int[] suffixSum = new int[N];
       suffixSum[N - 1] = A[N - 1];
       for (int i = N - 2; i >= 0; i--) {
           suffixSum[i] = suffixSum[i + 1] * A[i];
       }

       for (int i = 0; i < N; i++) {
           if(i==0)
           {
               output[i] = suffixSum[i+1];
           }
           else if(i==N-1)
           {
              output[i] = prefixSum[i-1];
           }
           else {
               output[i] = prefixSum[i-1] * suffixSum[i+1];
           }
       }
       return output;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            ProductArrayPuzzle pr = new ProductArrayPuzzle();
            System.out.println(Arrays.toString(pr.solve(arr)));
        }
    }
