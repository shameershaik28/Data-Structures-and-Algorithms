package Sorting;

import java.util.Arrays;
import java.util.Scanner;

//count of elements < element = ele itself
public class NobleIntegerUnique {
    public int solve(int[] A) {
       int n = A.length;
        Arrays.sort(A); //sort the array
       int ans = 0;
       for(int i = 0; i < n; i++) {
           if(A[i] == i)
           {
               ans++;
           }
       }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        NobleIntegerUnique obj = new NobleIntegerUnique();
        int ans = obj.solve(arr);
        System.out.println(ans);
    }
}
