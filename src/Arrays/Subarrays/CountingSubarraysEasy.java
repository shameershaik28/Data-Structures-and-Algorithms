package Arrays.Subarrays;

import java.util.Scanner;

//Two Pointers Approach : Most Optimal
public class CountingSubarraysEasy {
    public int solve(int[] A, int B) {
        int n = A.length;
        int ans = 0, sum = 0, left = 0;

        for (int right = 0; right < n; right++) {
            sum += A[right];

            // Shrink the window until the sum condition is satisfied
            while (sum >= B && left <= right) {
                sum -= A[left];
                left++;
            }

            // All subarrays ending at `right` and starting between `left` and `right` are valid
            ans += (right - left + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Enter the B value");
        int B = in.nextInt();

        CountingSubarraysEasy obj = new CountingSubarraysEasy();
        int ans = obj.solve(A, B);
        System.out.println(ans);
    }
}
