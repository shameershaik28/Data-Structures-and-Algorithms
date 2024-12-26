package InterviewQuestions;

import java.util.Scanner;

public class LengthOfLongestConsecutiveOnes {
    public int solve(String A) {
        int N = A.length(); // Get the length of the input string

        int totalOnes = 0, leftStreak = 0; // Initialize totalOnes to keep track of the total number of 1s
        int rightStreak = 0, maxStreak = 0; // rightStreak tracks the current streak of 1s and maxStreak stores the result

        // Iterate through the string
        for (int i = 0; i < N; i++) {
            // If the current character is '1', increment the right streak and total count of 1s
            if (A.charAt(i) == '1') {
                rightStreak++; // Increment the right streak of 1s
                totalOnes++; // Increment total count of 1s in the string
            } else {
                // If we encounter a '0', calculate the maximum streak by considering the left + right + 1 (for flipping 1 zero)
                maxStreak = Math.max(maxStreak, leftStreak + rightStreak + 1);

                // Reset the left streak to be the current right streak and reset the right streak
                leftStreak = rightStreak; // Move the current streak of 1s to the left part
                rightStreak = 0; // Reset the right streak since we've encountered a zero
            }
        }

        // Final check after the loop to ensure the last part is considered
        maxStreak = Math.max(maxStreak, leftStreak + rightStreak + 1);

        // Return the minimum of the total count of 1s and the maximum streak found (to avoid flipping more than one 0)
        return Math.min(totalOnes, maxStreak);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary string:");
        String A = sc.nextLine();
        LengthOfLongestConsecutiveOnes l = new LengthOfLongestConsecutiveOnes();
        System.out.println("Length of the longest consecutive ones: " + l.solve(A));
    }
}
