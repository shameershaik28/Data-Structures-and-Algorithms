package BinarySearch;

import java.util.Scanner;

public class BinarySearchInSortedArray {
    public int BinarySearch(int[] A, int target)
    {
         int N = A.length;
         int low = 0;
         int high = N-1;

             while(low<=high)
             {
                 int mid = low + (high-low)/2;
                 if(A[mid] == target) {
                     return mid;
                 }
                 else if(A[mid] < target) {
                     low = mid + 1;
                 }
                 else {
                     high = mid - 1;
                 }
             }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Value");
        int K = sc.nextInt();
       BinarySearchInSortedArray BS = new BinarySearchInSortedArray();
        int ans = BS.BinarySearch(arr, K);
        System.out.print(ans);
    }

}
