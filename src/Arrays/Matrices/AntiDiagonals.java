package Arrays.Matrices;

import java.util.ArrayList;
import java.util.Scanner;

public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i =0, j=0; j<n;j++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            int r =i, c=j;

            while(r<n && c>=0)
            {
                temp.add(A.get(r).get(c));
              r++;
              c--;
            }
            int size= temp.size();

            for(int k =size; k<n;k++)
            {
                temp.add(0);
            }
            ans.add(temp);
        }

        for(int i =1, j=n-1; i<n;i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            int r =i, c=j;

            while(r<n && c>=0)
            {
                temp.add(A.get(r).get(c));
                r++;
                c--;
            }
            int size= temp.size();

            for(int k =size; k<n;k++)
            {
                temp.add(0);
            }
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                row.add(sc.nextInt());
            }
            ans.add(row);
        }

        AntiDiagonals an = new AntiDiagonals();
        ArrayList<ArrayList<Integer>> result = an.diagonal(ans);
        System.out.println(result);



    }
}
