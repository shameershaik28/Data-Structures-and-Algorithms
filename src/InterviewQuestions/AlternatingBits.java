package InterviewQuestions;

import java.util.Scanner;

public class AlternatingBits {
    public int constructAlternatingBinary(int A) {
        int result = 0; // Step 2: Initialize the result to 0

        // Step 3: Loop to construct the binary number
        for (int i = 0; i < A; i++) {
            // Step 4: Shift result to the left to make space for the next bit
            result = result << 1;

            // Step 5: Add the appropriate bit (1 for even, 0 for odd positions)
            if (i % 2 == 0) { // Even positions: Add 1
                result = result | 1;
            } else { // Odd positions: Add 0
                result = result | 0 ;
            }
        }

        return result; // Step 6: Return the decimal value of the binary number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer A: ");
        int A = sc.nextInt();
        AlternatingBits bits = new AlternatingBits();
        int ans = bits.constructAlternatingBinary(A);
        System.out.println("The decimal value is: "+ ans);
    }
}
