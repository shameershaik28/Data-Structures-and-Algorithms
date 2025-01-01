package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsInARange {
    public int[] solve(String A, int[][] B) {
        int N = A.length();
        int M = B.length;
        int[] arr = new int[N];

        // check if it is a vowel
        for(int i = 0 ; i < N ; i++){
            char ch = A.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                arr[i] = 1;
            }
        }

        //Building the prefixSum array
        int[] prefixSum = new int[N];
        prefixSum[0] = arr[0];
        for(int i = 1 ; i < N ; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        //Processing the queries
        int[] ans = new int [M];
        for(int i = 0 ; i < M ; i++){
              int L = B[i][0];
              int R = B[i][1];

              if(L==0)
              {
                  ans[i] = prefixSum[R];
              }
              else {
                  ans[i] = prefixSum[R] + prefixSum[L - 1];
              }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String A = in.nextLine();
        System.out.println("Enter the rows : ");
        int M = in.nextInt();

        int[][] B = new int[M][2];
        System.out.println("Enter the elements in 2d array: ");
        for(int i = 0 ; i < M ; i++){
            B[i][0] = in.nextInt();
            B[i][1] = in.nextInt();
        }
        VowelsInARange v = new VowelsInARange();
        int[] ans = v.solve(A, B);
        System.out.println(Arrays.toString(ans));
    }
}
