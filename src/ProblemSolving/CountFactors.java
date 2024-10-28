package ProblemSolving;

import java.util.Scanner;

public class CountFactors {
    public int solve(int A) {
        if(A==0) return 0;
        int count = 0; // take your count value to find the factors
        for(int i =1; i*i<=A; i++)
        {
            if(A%i==0)
            {
                if(i==A/i) // if it is having the same value then increase to 1
                {
                    count= count+1;
                }
                else {
                    count=count+2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = sc.nextInt();

        CountFactors obj = new CountFactors();
        System.out.println("The number of factors of N is : " +  obj.solve(N));

    }
}
