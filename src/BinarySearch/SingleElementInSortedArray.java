package BinarySearch;

import java.util.Scanner;

public class SingleElementInSortedArray {
    public int solve(int[] A) {
         int N = A.length;
         int low = 0;
         int high = N - 1;
         while (low <= high) {
             int mid = low + (high - low) / 2;
             if((mid ==0 || A[mid]!=A[mid - 1]) && (mid ==N-1 || A[mid]!=A[mid+1])) {
                 return A[mid];
             }
             else {
                 int fi = FirstIndex(A, mid);
                 if(fi%2==0)
                 {
                     low = mid + 1;
                 }
                 else {
                     high = mid - 1;
                 }
             }
         }
         return -1;
    }
    public int FirstIndex(int[] A, int mid) {
        if(mid> 0 && A[mid]==A[mid - 1]) {
            return mid-1;
        }
        else {
            return mid;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        SingleElementInSortedArray obj = new SingleElementInSortedArray();
        int ans = obj.solve(A);
        System.out.println(ans);
    }
}
