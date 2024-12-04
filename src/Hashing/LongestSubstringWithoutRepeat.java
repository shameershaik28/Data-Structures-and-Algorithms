package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String A) {
        if (A == null || A.length() == 0) return 0; // Handle empty input

        int N = A.length();
        int MaxLength = 0;
        int left = 0;
        HashSet<Character> ans = new HashSet<>();

        for (int right = 0; right < N; right++) {
            while (ans.contains(A.charAt(right))) { // Check if current character is in the set
                ans.remove(A.charAt(left)); // Remove character at `left` from the set
                left++; // Move the left pointer
            }
            ans.add(A.charAt(right)); // Add current character to the set
            MaxLength = Math.max(MaxLength, right - left + 1); // Update maximum length
        }

        return MaxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        LongestSubstringWithoutRepeat l = new LongestSubstringWithoutRepeat();
        System.out.println(l.lengthOfLongestSubstring(s));
    }
}
