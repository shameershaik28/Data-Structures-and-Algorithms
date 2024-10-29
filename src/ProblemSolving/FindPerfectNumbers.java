package ProblemSolving;

import java.util.Scanner;

public class FindPerfectNumbers {
    public int solve(int A) {
        //Base Condition
        if(A<=0) return 0;
        int sum =0;
        for(int i=1; i<A;i++)
        {
            if(A%i==0)
            {
                sum = sum+i;
            }
        }
        if(sum==A)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = sc.nextInt();
        FindPerfectNumbers f = new FindPerfectNumbers();
        System.out.println(f.solve(N));
    }
}
