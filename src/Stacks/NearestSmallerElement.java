package Stacks;

import java.util.*;

public class NearestSmallerElement {
    public int[] prevSmaller(int[] A) {
        // Get the length of the input array
        int N = A.length;

        // Initialize the result array with the same length as input
        int ans[] = new int[N];

        // Create a stack to keep track of elements while iterating
        Stack<Integer> st = new Stack<>();

        // Iterate through each element in the input array
        for(int i = 0; i < N; i++) {
            // Pop elements from the stack as long as the stack is not empty
            // and the top of the stack is greater than or equal to the current element
            while(st.size() > 0 && st.peek() >= A[i]) {
                st.pop();
            }

            // If the stack is not empty, the top of the stack is the previous smaller element
            if(st.size() > 0) {
                ans[i] = st.peek();
            } else {
                // If the stack is empty, there is no smaller element to the left, so assign -1
                ans[i] = -1;
            }

            // Push the current element onto the stack
            st.push(A[i]);
        }

        // Return the result array containing the previous smaller elements for each input element
        return ans;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the NearestSmallerElement class
        NearestSmallerElement nse = new NearestSmallerElement();

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Read the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the prevSmaller method and get the result
        int[] result = nse.prevSmaller(arr);

        // Print the result
        System.out.println("The nearest smaller elements are: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

