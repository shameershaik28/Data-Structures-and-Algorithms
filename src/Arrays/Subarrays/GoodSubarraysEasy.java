package Arrays.Subarrays;

import java.util.ArrayList;
import java.util.Scanner;

//Brute-Force Approach
public class GoodSubarraysEasy {
        public int solve(int[] A, int B) {
            int n = A.length;
            int[] pref = new int[n];
            pref[0] = A[0];
            int ans = 0;
            for(int i = 1 ; i < n ; i++){
                pref[i] = pref[i - 1] + A[i];
            }
            for(int i = 0 ; i < n ; i++){
                for (int j = i ; j < n ; j++){
                    int sz = j - i + 1;
                    int sum;
                    if(i == 0){
                        sum = pref[j];
                    }
                    else{
                        sum = pref[j] - pref[i - 1];
                    }
                    if(sz % 2 == 0 && sum < B)ans++;
                    if(sz % 2 == 1 && sum > B)ans++;
                }
            }
            return ans;
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
        System.out.println("Enter the sum B: ");
        int B = sc.nextInt();

        GoodSubarraysEasy solution = new GoodSubarraysEasy();
        // Calling solve function and printing the result
        int result = solution.solve(A, B);
        System.out.println("Number of good subarrays is: " + result);
    }
    }
