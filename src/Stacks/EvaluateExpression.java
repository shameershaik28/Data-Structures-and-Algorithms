package Stacks;

import java.util.*;

public class EvaluateExpression {
    // Method to evaluate Reverse Polish Notation (RPN)
    public int evalRPN(String[] A) {
        Stack<Integer> st = new Stack<>(); // Stack to hold integer operands

        // Iterate through each token in the input array
        for (int i = 0; i < A.length; i++) {
            // Check if the token is an operator
            if (A[i].equals("+") || A[i].equals("-") || A[i].equals("*") || A[i].equals("/")) {
                int b = st.pop(); // Pop the top two elements for operation
                int a = st.pop(); // 'a' is the second operand, 'b' is the first

                // Perform the operation based on the operator
                if (A[i].equals("+")) {
                    st.push(a + b); // Addition
                } else if (A[i].equals("-")) {
                    st.push(a - b); // Subtraction
                } else if (A[i].equals("*")) {
                    st.push(a * b); // Multiplication
                } else if (A[i].equals("/")) {
                    st.push(a / b); // Division
                }
            } else {
                // If the token is a number, parse it and push to stack
                int aa = Integer.parseInt(A[i]);
                st.push(aa);
            }
        }
        return st.peek(); // Return the result (top of the stack)
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the EvaluateExpression class
        EvaluateExpression ee = new EvaluateExpression();

        // Read input expression
        System.out.println("Enter the Reverse Polish Notation expression (space-separated): ");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        // Call the evalRPN method and get the result
        int result = ee.evalRPN(tokens);

        // Print the result
        System.out.println("The result of the evaluation is: " + result);

        sc.close();
    }
}

