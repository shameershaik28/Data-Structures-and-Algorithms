package ProblemSolving;

import java.util.Scanner;

public class CountOfElements {
    public int solve(int[] A) {
        int N = A.length;
        int max = Integer.MIN_VALUE;

        //Find the max
        for(int i = 0; i < N; i++){
            if(A[i] > max){
               max = A[i];
            }
        }
        int count = 0;
        // Count elements that are less than the maximum
        for (int i = 0; i < N; i++) {
            if (A[i] < max && A[i] !=max) { // the A[i] should be less, and also it shouldn't be same
                count++;
            }
        }

        return count; // returns the count

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();

        int[] arr = new int[N];
System.out.println("Enter the elements of array");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        CountOfElements obj = new CountOfElements();
        System.out.println(obj.solve(arr));
    }
}
