package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayPuzzle {
    public int[] solve(int[] A) {

        int N = A.length;
        if (N == 0) {
            return new int[0]; // Handle empty array case
        }

        int[] output = new int[N];

        // Calculate prefix or left products
        output[0] = 1; // The first element has no prefix product
        for (int i = 1; i < N; i++) {
            output[i] = output[i - 1] * A[i - 1]; // Multiply previous output by previous A element
        }

        // Calculate suffix products and combine with prefix products
        int suffix = 1; // Start with the suffix product as 1
        for (int i = N - 1; i >= 0; i--) {
            output[i] *= suffix; // Multiply by the current suffix
            suffix *= A[i]; // Update suffix to include current element
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
