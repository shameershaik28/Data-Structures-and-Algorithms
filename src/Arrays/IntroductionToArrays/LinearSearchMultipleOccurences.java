package Arrays.IntroductionToArrays;

import java.util.Scanner;

public class LinearSearchMultipleOccurences {
    public int solve(int[] A, int B) {
        int N = A.length;
        int count=0;
        for(int i = 0; i < N; i++) {
            if(A[i]==B)
            {
                count++;
            }
        }
        return count;
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
        System.out.println("Enter the element B");
        int B = sc.nextInt();

        LinearSearchMultipleOccurences l = new LinearSearchMultipleOccurences();
        int ans = l.solve(A, B);
        System.out.println(ans);
    }

}
