package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HeapQueries {
    public int[] solve(int[][] A) {
        int rows = A.length;
        ArrayList<Integer> ans  = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0; i < rows; i++) {
            if(A[i][0]==1) // remove operation
            {
                if(!pq.isEmpty())
                {
                    ans.add(pq.remove());
                }
                else
                {
                    ans.add(-1);
                }
            }
            else { // add operation
                pq.add(A[i][1]);
            }
        }

        int[] result = new int[ans.size()]; // convert arraylist into fixed array
        for(int i = 0; i < ans.size(); i++)
        {
            result[i] = ans.get(i);
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of array");
        int N = sc.nextInt();

        int[][] A = new int[N][2];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        HeapQueries q = new HeapQueries();
        int[] result = q.solve(A);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
