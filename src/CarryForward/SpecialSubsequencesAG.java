package CarryForward;

import java.util.Scanner;

public class SpecialSubsequencesAG {
    public long solve(String A) {
        int N = A.length();
        int count = 0;

        for(int i = 0; i < N; ++i) {
            for(int j = i + 1; j < N; ++j) {
                if (A.charAt(i) == 'A' && A.charAt(j) == 'G') {
                   count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        SpecialSubsequencesAG s = new SpecialSubsequencesAG();
        long result = s.solve(input);
        System.out.println("Result: " + result);
        sc.close();
    }
}
