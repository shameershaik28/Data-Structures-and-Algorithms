package Arrays.IntroductionToArrays;

import java.util.Scanner;

public class GoodPair {
    public int solve(int[] A, int B) {
        int N = A.length;
        // Edge case for array size < 2
        if (N < 2) return 0;

        for(int i =0; i<N ; i++)
        {
            for(int j = i+1; j<N; j++)
            {
                if(i!=j && A[i]+A[j] == B)
                {
                    return 1;
                }
            }
        }
        return 0;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int N = input.nextInt();

        int[] A = new int[N];
System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < N; i++)
        {
            A[i] = input.nextInt();
        }
        System.out.println("Enter the element B: ");
        int B = input.nextInt();

        GoodPair gp = new GoodPair();
        int ans = gp.solve(A, B);
        System.out.println(ans);

    }
}
