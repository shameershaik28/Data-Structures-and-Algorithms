package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsInARange {
    public int[] solve(String A, int[][] B) {
        int n = A.length();
        int[] pref = new int[n + 1];
        pref[0] = 0;
        for(int i = 0 ; i < n ; i++){
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u'){
                pref[i + 1] = pref[i] + 1;
            }
            else{
                pref[i + 1] = pref[i];
            }
        }
        int[] ans = new int [B.length];
        for(int i = 0 ; i < B.length ; i++){
            ans[i] = pref[B[i][1] + 1] - pref[B[i][0]];
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
