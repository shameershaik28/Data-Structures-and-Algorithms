package InterviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortedOverlappingIntervals {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Ensure the intervals are sorted
        A.sort((o1, o2) -> o1.get(0) - o2.get(0));

        int curr_Start = A.get(0).get(0);
        int curr_End = A.get(0).get(1);

        for (int i = 1; i < n; i++) {
            int i_Start = A.get(i).get(0);
            int i_End = A.get(i).get(1);

            // If overlapping
            if (i_Start <= curr_End) {
                curr_Start = Math.min(curr_Start, i_Start);
                curr_End = Math.max(curr_End, i_End);
            } else {
                // Non-overlapping
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(curr_Start);
                temp.add(curr_End);
                ans.add(temp);

                // Update current interval
                curr_Start = i_Start;
                curr_End = i_End;
            }
        }

        // Add the last merged interval
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(curr_Start);
        temp.add(curr_End);
        ans.add(temp);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int N = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        System.out.println("Enter elements: ");
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> A = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                A.add(sc.nextInt());
            }
            ans.add(A);
        }

        MergeSortedOverlappingIntervals m = new MergeSortedOverlappingIntervals();
        System.out.println(m.solve(ans));

        sc.close();
    }
}
