package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int N = A.length;

        int[] output = new int[N];
        int product = 1;
        for(int i = 0; i < N; i++)
        {
             product *= A[i];
        }

        for(int i = 0; i < N; i++)
        {
            output[i] = product/A[i];
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
