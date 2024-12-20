package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public int solve(int[] A, int B) {
        int N = A.length;
        Arrays.sort(A);
        int low = 0, high = A[N-1]- A[0];
        int ans = 0;
        while (low <=high) {
            int mid = low + (high - low)/2;
            if(isPossibleToPlaceCows(A,mid,B))
            {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public boolean isPossibleToPlaceCows(int[] A, int distance, int B) {
        int i =0;
        int count = 1;

        for(int j=1; j<A.length; j++)
        {
            if(A[j]-A[i]>=distance)
            {
                count++;
                i = j;
            }

            if(count == B)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = in.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Enter the number of cows: ");
        int B = in.nextInt();

        AggressiveCows a = new AggressiveCows();
        int ans = a.solve(A, B);
        System.out.println(ans);
    }
}
