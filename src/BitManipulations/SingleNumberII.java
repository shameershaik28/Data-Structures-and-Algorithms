package BitManipulations;

import java.util.Scanner;

public class SingleNumberII {
    public int singleNumber(final int[] A) {
        int ans = 0;

        for(int i=0;i<32;i++)
        {
            int count = 0;
            for(int j=0;j< A.length;j++)
            {
                if((A[j]&(1<<i))>0)
                {
                    count++;
                }
            }

            if(count%3>0)
            {
                ans = ans | (1<<i); // set the ith bit
            }
        }
        return ans;

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

        SingleNumberII s = new SingleNumberII();
        System.out.println(s.singleNumber(A));
    }
}
