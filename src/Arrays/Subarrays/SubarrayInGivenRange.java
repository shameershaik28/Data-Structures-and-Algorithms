package Arrays.Subarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayInGivenRange {
    public int[] solve(int[] A, int B, int C) {

        int[] ans = new int[C-B+1];
        for(int i =B; i<=C; i++)
        {
            ans[i-B]=A[i];
        }
        return ans;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int N = sc.nextInt();

    int[] A = new int[N];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < N; i++) {
        A[i] = sc.nextInt();
    }
    System.out.println("Enter the start index B : ");
    int B = sc.nextInt();
    System.out.println("Enter the end index C : ");
    int C = sc.nextInt();

    SubarrayInGivenRange s = new SubarrayInGivenRange();
    System.out.println(Arrays.toString(s.solve(A, B, C)));
}
}
