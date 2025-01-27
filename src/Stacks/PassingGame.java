package Stacks;

import java.util.*;

public class PassingGame {

    public int solve(int A, int B, ArrayList<Integer> C) {

        // Edge Case: If there is only one pass
        // Then return the first player ID itself.
        if (A == 1) {
            return C.get(0);
        }

        // Otherwise Initialize Stack
        Stack<Integer> players = new Stack<Integer>();

        // Push the ID of the first player that has the ball
        // At the very beginning
        players.push(B);

        // Now traverse through the ArrayList from 0-th index to the A-th index
        // Checking the ID of the players
        // If the ID at any i-th index == 0
        // Then pop the last element
        // Otherwise keep pushing the IDs of the next player
        for (int i = 0; i < A; i++) {

            int player = C.get(i);

            if (player == 0) {
                players.pop();
            } else {
                players.push(player);
            }
        }

        return players.peek();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the PassingGame class
        PassingGame pg = new PassingGame();

        // Read inputs
        System.out.print("Enter the number of passes (A): ");
        int A = sc.nextInt();

        System.out.print("Enter the ID of the player with the ball initially (B): ");
        int B = sc.nextInt();

        ArrayList<Integer> C = new ArrayList<>();
        System.out.println("Enter the sequence of passes (C): ");
        for (int i = 0; i < A; i++) {
            C.add(sc.nextInt());
        }

        // Call the solve method and get the result
        int result = pg.solve(A, B, C);

        // Print the result
        System.out.println("The player with the ball at the end is: " + result);

        sc.close();
    }
}

