package InterviewQuestions;

import java.util.Scanner;

public class LengthOfLongestConsecutiveOnes {
    public int solve(String A) {
        int N = A.length();
        int totalOnes = 0;
        int maxCount = 0;

        // Count total number of '1's
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '1') {
                totalOnes++;
            }
        }

        if (totalOnes == 1) {
            return 1;
        }

        // If the entire string is '1's, we can only return the length
        if (totalOnes == N) {
            return N;
        }

        if(totalOnes==0)
        {
            return 0;
        }


        // Iterate through the string
        for (int i = 0; i < N; i++) {
            // If current character is '0', calculate left and right lengths
            if (A.charAt(i) == '0') {
                int left = 0;

                // Count consecutive '1's on the left
                int j = i - 1;
                while (j >= 0 && A.charAt(j) == '1') {
                    left++;
                    j--;
                }

                // Count consecutive '1's on the right
                j = i + 1;
                int right = 0;
                while (j < N && A.charAt(j) == '1') {
                    right++;
                    j++;
                }
                // If flipping the '0' does not exceed total ones, include it
                int currentLength = left + right + 1;
                if (left + right < totalOnes) {
                    maxCount = Math.max(maxCount, currentLength);
                } else {
                    maxCount = Math.max(maxCount, left + right);
                }
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary string:");
        String A = sc.nextLine();
        LengthOfLongestConsecutiveOnes l = new LengthOfLongestConsecutiveOnes();
        System.out.println("Length of the longest consecutive ones: " + l.solve(A));
    }
}
