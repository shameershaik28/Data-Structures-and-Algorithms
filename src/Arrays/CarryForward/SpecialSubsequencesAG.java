package Arrays.CarryForward;

import java.util.Scanner;

public class SpecialSubsequencesAG {
    public long solve(String A) {
        int N = A.length();
        long countG = 0;
        long pairs=0;

        for (int i = N-1; i>=0; i--) {
            if(A.charAt(i) == 'G') {
                countG++;
            }
            else
            {
                if(A.charAt(i) == 'A') {
                    pairs=pairs+countG;
                }
            }
        }
        return pairs;
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
