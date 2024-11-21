package Strings;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public int longestPalindrome(String A) {
        int n = A.length();
        int even =0, odd =0;

        for(int i=0;i<n;i++){
            int p1=i, p2=i;
            while(p1>=0 && p2<n){
                if(A.charAt(p1)==A.charAt(p2)){
                    p1--;
                    p2++;
                }
                else{
                    break;
                }
            }
            int len = p2-p1-1;
            odd = Math.max(odd,len);
        }

        for(int i=0;i<n;i++){
            int p1=i, p2=i+1;
            while(p1>=0 && p2<n){
                if(A.charAt(p1)==A.charAt(p2)){
                    p1--;
                    p2++;
                }
                else{
                    break;
                }
            }
            int len = p2-p1-1;
            even = Math.max(even,len);
        }
        return Math.max(odd, even);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome(s));
    }
}
