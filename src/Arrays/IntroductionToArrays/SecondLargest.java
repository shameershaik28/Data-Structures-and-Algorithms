package Arrays.IntroductionToArrays;

import java.util.Scanner;

public class SecondLargest {
    public int solve(int[] A) {
        if (A.length < 2) {
            return -1; // Not enough elements for a second largest
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        int Smax= Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]!=max && A[i]>Smax){
                Smax=A[i];
            }
        }
        return (Smax == Integer.MIN_VALUE) ? -1 : Smax; // Return -1 if no second largest exists
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = scanner.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        SecondLargest s = new SecondLargest();
        int ans = s.solve(A);
        System.out.println(ans);
    }
}
