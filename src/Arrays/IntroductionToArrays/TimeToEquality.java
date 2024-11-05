package Arrays.IntroductionToArrays;

import java.util.Scanner;

public class TimeToEquality {
    public int solve(int[] A) {
        int N = A.length;

        int count =0;
        int Max = Integer.MIN_VALUE;

        for(int i=0;i<N;i++)
        {
            if(A[i]>Max)
            {
                Max = A[i];
            }
        }

        for(int i =0; i<N; i++)
        {
            if(A[i]!=Max)
            {
                count+= Max - A[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }

        TimeToEquality t = new TimeToEquality();
        int ans = t.solve(A);
        System.out.println(ans);
    }
}
