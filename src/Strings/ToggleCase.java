package Strings;

import java.util.Scanner;

public class ToggleCase {
    public String solve(String A) {
        char[] ans = A.toCharArray(); // convert to character array

        for(int i = 0; i < ans.length; i++) {
            if(ans[i] >='a' && ans[i] <='z') {
                ans[i] = (char)(ans[i] - 32);
            }
            else
            {
                ans[i] = (char)(ans[i] + 32);
            }
        }
        return new String(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        ToggleCase t = new ToggleCase();
        String ans = t.solve(s);
        System.out.println(ans);

    }
}
