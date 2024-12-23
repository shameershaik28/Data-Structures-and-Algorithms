package Arrays.Subarrays;

import java.util.ArrayList;
import java.util.Scanner;

//Brute-Force Approach
public class GoodSubarraysEasy {
        public int solve(ArrayList<Integer> A, int B) {
            int count = 0, left = 0, sum = 0;

            for (int right = 0; right < A.size(); right++) {
                sum += A.get(right);

                while (sum >= B && left <= right) {
                    sum -= A.get(left);
                    left++;
                }

                // All subarrays ending at 'right' and starting from any index 'left' to 'right'
                count += (right - left + 1);
            }

            return count;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int N = sc.nextInt();

            ArrayList<Integer> A = new ArrayList<>();

            System.out.println("Enter the elements of the array");
            for(int i=0; i<N; i++)
            {
                A.add(sc.nextInt());
            }
            System.out.println("Enter the sum B : ");
            int B = sc.nextInt();
            GoodSubarraysEasy solution = new GoodSubarraysEasy();
            // Calling solve function and printing the result
            int result = solution.solve(A, B);
            System.out.println("Number of subarrays with sum less than " + B + " is: " + result);
        }
    }
