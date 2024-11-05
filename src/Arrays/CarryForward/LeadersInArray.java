package Arrays.CarryForward;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();

        ArrayList<Integer> ans  = new ArrayList<>();
        int max = A.get(N-1);
        ans.add(max);

        for(int i =N-2; i>=0; i--) {
            int temp = A.get(i);
            if (temp>max)
            {
                ans.add(temp);
                max = temp;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        LeadersInArray l = new LeadersInArray();
        ArrayList<Integer> ans = l.solve(A);
        System.out.println(ans);
    }
}
