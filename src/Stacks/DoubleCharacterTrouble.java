package Stacks;

import java.util.*;

public class DoubleCharacterTrouble {
    // Method to solve the problem as described in the prompt
    public String solve(String A) {
        // Initialize a stack to store characters
        Stack<Character> st = new Stack<>();

        // Get the length of the input string
        int N = A.length();

        // Loop through the string in reverse order
        for (int i = N - 1; i >= 0; i--) {
            // If the stack is empty, push the current character onto the stack
            if (st.size() == 0) {
                st.push(A.charAt(i));
            }
            // If the current character matches the character at the top of the stack, pop the stack
            else if (A.charAt(i) == st.peek()) {
                st.pop();
            }
            // If the current character does not match the top of the stack, push it onto the stack
            else {
                st.push(A.charAt(i));
            }
        }

        // Initialize a StringBuilder to build the resulting string
        StringBuilder sb = new StringBuilder();

        // Pop all characters from the stack and append them to the StringBuilder
        while (st.size() > 0) {
            char ch = st.peek();
            st.pop();
            sb.append(ch);
        }

        // Convert the StringBuilder to a string and return it as the result
        return sb.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the Solution class
        DoubleCharacterTrouble solution = new DoubleCharacterTrouble();

        // Read input string
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        // Call the solve method and get the result
        String result = solution.solve(input);

        // Print the result
        System.out.println("Result: " + result);

        sc.close();
    }
}

