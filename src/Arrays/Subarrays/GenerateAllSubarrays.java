package Arrays.Subarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateAllSubarrays {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Loop to generate all subarrays
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> sub = new ArrayList<>();
            // For each starting point i, extend the subarray to the right
            for (int j = i; j < N; j++) {
                sub.add(A.get(j)); // Add element to the current subarray
                ans.add(new ArrayList<>(sub)); // Store the current subarray
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements of the array");
        for(int i=0; i<N; i++)
        {
            list.add(sc.nextInt());
        }

        GenerateAllSubarrays g = new GenerateAllSubarrays();
        ArrayList<ArrayList<Integer>> res = g.solve(list);
        System.out.println("The subarrays are : "+ res);

    }
}
