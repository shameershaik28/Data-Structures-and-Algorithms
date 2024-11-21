package Strings;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        int n = A.length();
        int start = 0;  // To store the starting index of the longest palindrome found
        int maxLength = 0;  // To store the maximum length of palindrome found

        // Check for odd length palindromes
        for (int i = 0; i < n; i++) {
            int p1 = i, p2 = i;
            while (p1 >= 0 && p2 < n && A.charAt(p1) == A.charAt(p2)) {
                p1--;
                p2++;
            }
            int len = p2 - p1 - 1;  // Length of the palindrome
            if (len > maxLength) {
                maxLength = len;
                start = p1 + 1;  // Update the starting index of the palindrome
            }
        }

        // Check for even length palindromes
        for (int i = 0; i < n; i++) {
            int p1 = i, p2 = i + 1;
            while (p1 >= 0 && p2 < n && A.charAt(p1) == A.charAt(p2)) {
                p1--;
                p2++;
            }
            int len = p2 - p1 - 1;
            if (len > maxLength) {
                maxLength = len;
                start = p1 + 1;
            }
        }

        return A.substring(start, start + maxLength);  // Return the longest palindromic substring
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome(s));
    }
}
