package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonElements {
        // Method to find common elements and their frequencies
        public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
            // Creating a HashMap to store frequencies of elements from list A
            Map<Integer, Integer> freq = new HashMap<>();
            // Creating an ArrayList to store common elements
            ArrayList<Integer> ans = new ArrayList<>();

            // Looping through list A to calculate frequencies of elements
            for (int i = 0; i < A.size(); i++) {
                // If the element is already in the HashMap, increment its frequency
                if (freq.containsKey(A.get(i))) {
                    freq.put(A.get(i), freq.get(A.get(i)) + 1);
                } else { // If the element is not in the HashMap, add it with frequency 1
                    freq.put(A.get(i), 1);
                }
            }

            // Looping through list B to find common elements
            for (int i = 0; i < B.size(); i++) {
                // If the element from list B is present in the HashMap
                if (freq.containsKey(B.get(i))) {
                    ans.add(B.get(i)); // Add the element to the result ArrayList
                    freq.put(B.get(i), freq.get(B.get(i)) - 1); // Decrement its frequency in the HashMap
                    // If the frequency becomes 0, remove the element from the HashMap
                    if (freq.get(B.get(i)) == 0) {
                        freq.remove(B.get(i));
                    }
                }
            }
            // Returning the ArrayList containing common elements
            return ans;
        }

        public static void main(String[] args) {
            // Creating a scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Reading the first array
            System.out.print("Enter the number of elements in array A: ");
            int n = scanner.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            System.out.println("Enter the elements of array A: ");
            for (int i = 0; i < n; i++) {
                A.add(scanner.nextInt());
            }

            // Reading the second array
            System.out.print("Enter the number of elements in array B: ");
            int m = scanner.nextInt();
            ArrayList<Integer> B = new ArrayList<>();
            System.out.println("Enter the elements of array B: ");
            for (int i = 0; i < m; i++) {
                B.add(scanner.nextInt());
            }

            // Creating an instance of Solution class
            CommonElements solution = new CommonElements();

            // Calling the solve method to get the common elements
            ArrayList<Integer> commonElements = solution.solve(A, B);

            // Printing the common elements
            System.out.println("Common elements: " + commonElements);

            // Closing the scanner
            scanner.close();
        }
    }