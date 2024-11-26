package BitManipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int N = A.size();
        int result = 0;

        // XOR all elements
        for(int i = 0; i < N; i++){
            result^=A.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt()); // Use add() to populate the list
        }

        SingleNumber ob = new SingleNumber();
        int ans = ob.singleNumber(A);
        System.out.println("Single number is: " + ans);
    }
}
