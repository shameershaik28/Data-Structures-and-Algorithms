package ProblemSolving;

import java.util.Scanner;

public class IsPrime {
    public int isPrime(int number) {
        if(solve(number)==2) // it counts the factors of number
        {
            return 1;
        }
            return 0;
    }

    public int solve(int A) {
        if (A <= 0) return 0;
        int count = 0;
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

        IsPrime obj = new IsPrime();
        int factorCount = obj.solve(N); // Get the number of factors
        int primeStatus = obj.isPrime(N); // Check if it’s prime

        System.out.println("The number of factors of " + N + " is: " + factorCount);
        System.out.println(N + " is " + (primeStatus == 1 ? "a prime number" : "not a prime number"));

    }
}
