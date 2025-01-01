package InterviewQuestions;

import java.util.Scanner;

public class LittlePonnyAndMaximumElement {
    public int solve(int[] A, int B) {
        int N = A.length;

        int minOperations=0;
        // Check if B exists in the array
        boolean exists = false;
        for(int i=0; i<N;i++)
        {
            if(A[i]==B)
            {
                exists=true;
            }

            if(A[i]>B)
            {
                minOperations++;
            }
        }
        // If B does not exist in the array, return -1
        if (!exists) {
            return -1;
        }

        // If no elements are greater than B, return -1, else return minOperations
        return (minOperations > 0) ? minOperations : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        LittlePonnyAndMaximumElement sol = new LittlePonnyAndMaximumElement();
        int ans = sol.solve(A, B);
        System.out.println(ans);
    }
}
