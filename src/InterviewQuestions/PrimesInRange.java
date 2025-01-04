package InterviewQuestions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimesInRange {
    public int[] solve(int A, int B) {
        ArrayList<Integer> res = new ArrayList<>();  // List to store prime numbers
        for (int num = A; num <= B; num++) {
            if (isPrime(num)) {
                res.add(num);  // Add prime number to the list
            }
        }

        // Step 2: Convert the ArrayList to an int[] array
        int[] s = new int[res.size()];  // Create an array of the same size as the ArrayList
        for (int i = 0; i < res.size(); i++) {
            s[i] = res.get(i);  // Copy each prime number from the ArrayList to the array
        }

        return s;  // Return the array of prime numbers
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // If divisible by any number between 2 and sqrt(num), it's not prime
            }
        }
        return true;  // The number is prime if no divisors were found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range A value : ");
        int A = sc.nextInt();
        System.out.println("Enter the Ending range B value : ");
        int B = sc.nextInt();
        PrimesInRange pis = new PrimesInRange();
        int[] res = pis.solve(A, B);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
