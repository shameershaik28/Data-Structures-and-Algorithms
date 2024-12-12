package QuickSortAndComparatorProblems;
import java.util.Arrays;


import java.util.Scanner;

public class LargestNumber {
    public String largestNumber(int[] A) {
        int n = A.length;

        // Convert the integer array into a string array to handle concatenation and sorting
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = A[i] + "";  // Convert each integer to a string
        }

        // Sort the string array based on custom comparator logic
        Arrays.sort(arr, (a, b) -> {
            // Concatenate both a+b and b+a as strings, then compare their numeric values
            long n1 = Long.parseLong(a + b);  // Concatenate a and b, and convert to long
            long n2 = Long.parseLong(b + a);  // Concatenate b and a, and convert to long

            // If n1 > n2, then a should come before b
            if (n1 > n2) {
                return 1;
            }
            // If n1 < n2, then b should come before a
            if (n1 < n2) {
                return -1;
            }
            // If both concatenated results are equal, they can be in any order
            else {
                return 0;
            }
        });

        // Use a StringBuilder to concatenate the sorted strings into the largest number
        StringBuilder sb = new StringBuilder("");
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);  // Append each number in the sorted order to the StringBuilder
        }

        // Handle the edge case where the result might be a string of "0"s (e.g., [0, 0, 0])
        if (sb.charAt(0) == '0') {
            return "0";  // If the first character is '0', return "0" because it means all numbers are zero
        }

        // Return the final concatenated largest number as a string
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        LargestNumber l = new LargestNumber();
        String largest = l.largestNumber(A);
        System.out.println(largest);

    }
}
