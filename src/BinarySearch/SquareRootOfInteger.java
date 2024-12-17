package BinarySearch;

import java.util.Scanner;

public class SquareRootOfInteger {
    public int sqrt(int A) {
        if(A <=0 || A==1) return A;
        int low = 1;
        int high = A / 2;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid <= A) {
                ans = mid;
                low = (int) (mid + 1);
            } else {
                high = (int) (mid - 1);
            }

        }
        return (int)ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int N = sc.nextInt();
        SquareRootOfInteger sqr = new SquareRootOfInteger();
        int ans = sqr.sqrt(N);
        System.out.println("the Square Root is : "+ ans);
    }
}
