package Strings;

import java.util.Scanner;

public class  SimpleReverse {
    public String solve(String A) {

        char[] ans = A.toCharArray(); // convert it to character array
        int N = ans.length;
        int s =0;
        int e = N-1;

        while(s<e)
        {
            int temp = ans[s];
            ans[s] = ans[e];
            ans[e] = (char) temp;
            s++;
            e--;
        }
        return new String(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        SimpleReverse l = new SimpleReverse();
        System.out.println(l.solve(s));
    }
}