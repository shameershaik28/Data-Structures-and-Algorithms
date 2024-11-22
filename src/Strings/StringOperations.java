package Strings;

import java.util.Scanner;

public class StringOperations {
        public String solve(String A) {
            StringBuilder res = new StringBuilder();
            for(int i=0;i<A.length();i++)
            {
                if(A.charAt(i)>='a' && A.charAt(i)<='z')
                {
                    if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
                    {
                        res.append("#");
                    }
                    else
                    {
                        res.append(A.charAt(i));
                    }
                }
            }
            res.append(res);
            return res.toString();
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // Read input string
        StringOperations so = new StringOperations();
        System.out.println(so.solve(s));  // Call solve and print the result
        sc.close();  // Close the scanner resource
    }
}
