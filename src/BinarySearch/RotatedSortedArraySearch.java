package BinarySearch;

import java.util.Scanner;

public class RotatedSortedArraySearch {
    public int search(final int[] A, int B) {
        int N = A.length;
        int low = 0;
        int high = N - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == B) {
                return mid;
            }
            else if(A[low]<A[mid])
            { //It is sorted

                if(A[low]<=B && B<=A[mid-1])
                {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if(A[mid+1]<=B && B<=A[high])
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int B = sc.nextInt();
        RotatedSortedArraySearch rsa = new RotatedSortedArraySearch();
        int ans = rsa.search(A, B);
        System.out.println(ans);
    }
}
