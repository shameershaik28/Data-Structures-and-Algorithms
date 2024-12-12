package QuickSortAndComparatorProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FactorsSort {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        // Sorting the list using a custom comparator
        Collections.sort(A, new Comparator<Integer>() {
            // Compare function to compare two elements
            public int compare(Integer a, Integer b) {
                // Find the factor counts of two numbers
                int cfX = factorCount(a);
                int cfY = factorCount(b);

                // Compare based on the number of factors
                if (cfX < cfY)
                    return -1; // Smaller count comes first
                else if (cfX > cfY)
                    return 1;  // Larger count comes later
                else {
                    // If counts are equal, compare values numerically
                    if (a <= b)
                        return -1; // Smaller number comes first
                    else
                        return 1;  // Larger number comes later
                }
            }

            // Function to calculate the number of factors of a number
            public int factorCount(int n) {
                int count = 0;
                for (int i = 1; i * i <= n; i++) {
                    if (n % i == 0) {
                        if (i == n / i) // Perfect square case
                            count++;
                        else
                            count += 2; // Count both factors
                    }
                }
                return count;
            }
        });

        return A; // Return the sorted list
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of elements
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();

        // Input: List of elements
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        // Create an instance of the FactorSort class

        FactorsSort fs = new FactorsSort();

        // Call the solve method to sort the list
        ArrayList<Integer> sortedList = fs.solve(A);

        // Output: Sorted list
        System.out.println("Sorted list:");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
