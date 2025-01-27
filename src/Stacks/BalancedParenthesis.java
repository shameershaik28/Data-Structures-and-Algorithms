package Stacks;

import java.util.*;

public class BalancedParenthesis {
    // Method to check if the input string A has balanced parentheses
    public int solve(String A) {
        // Create a stack to keep track of opening brackets
        Stack<Character> st = new Stack<>();

        // Get the length of the input string
        int N = A.length();

        // Loop through each character in the string
        for (int i = 0; i < N; i++) {
            // If the character is an opening bracket, push it onto the stack
            if (A.charAt(i) == '(' || A.charAt(i) == '{' || A.charAt(i) == '[') {
                st.push(A.charAt(i));
            }
            // If the character is a closing bracket
            else {
                // If the stack is empty, it means there is no matching opening bracket
                if (st.size() == 0) {
                    return 0; // Unbalanced, return 0
                }
                // Check if the top of the stack is the matching opening bracket for the current closing bracket
                else if (st.peek() == '(' && A.charAt(i) == ')') {
                    st.pop(); // Pop the matching opening bracket from the stack
                } else if (st.peek() == '{' && A.charAt(i) == '}') {
                    st.pop(); // Pop the matching opening bracket from the stack
                } else if (st.peek() == '[' && A.charAt(i) == ']') {
                    st.pop(); // Pop the matching opening bracket from the stack
                }
                // If the top of the stack does not match the current closing bracket, return 0
                else {
                    return 0; // Unbalanced, return 0
                }
            }
        }

        // After processing all characters, check if the stack is empty
        if (st.size() == 0) {
            return 1; // Balanced, return 1
        } else {
            return 0; // Unbalanced, return 0
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the BalancedParenthesis class
        BalancedParenthesis bp = new BalancedParenthesis();

        // Read input string
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        // Call the solve method and get the result
        int result = bp.solve(input);

        // Print the result
        if (result == 1) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }

        sc.close();
    }
}

