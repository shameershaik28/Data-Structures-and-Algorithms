package ProblemSolving;

import java.util.Scanner;

public class FindPerfectNumbers {
    public int solve(int A) {
        //Base Condition
        if(A<=0) return 0;
        int sum =1; // 1 is the common divisor for all values
        for(int i=2; i*i<=A;i++) {
            if (A % i == 0) {
                if(i==A/i)
                {
                    sum = sum + i;
                }
                else
                {
                    sum = sum + i+A/i;
                }
            }
        }
        return (sum==A)? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = sc.nextInt();
        FindPerfectNumbers f = new FindPerfectNumbers();
        System.out.println(f.solve(N));
    }
}
