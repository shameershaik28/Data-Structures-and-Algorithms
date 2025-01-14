package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        // Initialize prefix and suffix products
        prefix[0] = 1;
        suffix[n - 1] = 1;

        // Compute prefix product
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * A[i - 1];
        }

        // Compute suffix product
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * A[i + 1];
        }

        // Compute result by multiplying prefix and suffix products
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
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
