package Heaps;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticProgression {
    public int solve(int[] A) {
       int N = A.length;

        Arrays.sort(A);
       int diff = A[1]-A[0];

       for(int i = 2; i < N; i++){
           if(A[i]-A[i-1] != diff){
               return 0;
           }
       }
       return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        ArithmeticProgression obj = new ArithmeticProgression();
        int ans = obj.solve(A);
        System.out.println(ans);
    }
}
