package Arrays.Subarray;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateSubarrays {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        int N = A.size();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int s=0; s<N; s++)
        {
            for(int e =s; e<N ;e++) {
                ArrayList<Integer> sub = new ArrayList<>();
                for (int k = s; k <= e; k++) {
                    sub.add(A.get(k));
                }
                ans.add(sub);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();


        System.out.println("Enter the elements of the array");
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        GenerateSubarrays g = new GenerateSubarrays();
        ArrayList<ArrayList<Integer>> res = g.solve(A);
        System.out.println(res);

    }
}
