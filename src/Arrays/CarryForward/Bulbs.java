package Arrays.CarryForward;

import java.util.ArrayList;
import java.util.Scanner;

public class Bulbs {
    public int bulbs(ArrayList<Integer> A) {
        int N = A.size();
        int counter = 0;
        int state =0;

        for(int i = 0; i < N; i++) {

            if(A.get(i) ==state)
            {
                counter++;
                state = 1-state;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        Bulbs b = new Bulbs();
        int ans = b.bulbs(A);
        System.out.println(ans);
    }
}
