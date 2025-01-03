package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountUniqueElements {
    public int solve(int[] A) {
        // Creating a HashMap to store the frequency of each element
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Looping through the array to count the frequency of each element
        for(int i = 0; i < A.length; i++) {
            // Checking if the element is already in the HashMap
            if(hm.containsKey(A[i])) {
                // If the element is already present, increment its frequency by 1
                int freq = hm.get(A[i]);
                hm.put(A[i], freq + 1);
            } else {
                // If the element is not present, add it to the HashMap with a frequency of 1
                hm.put(A[i], 1);
            }
        }

        int count = 0; // Initializing a variable to count the unique elements

        // Looping through the array to count the unique elements
        for(int i = 0; i < A.length; i++) {
            // Checking if the frequency of the current element is 1 (i.e., it is unique)
            if(hm.get(A[i]) == 1) {
                count++; // If yes, increment the count
            }
        }

        // Returning the count of unique elements
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        CountUniqueElements obj = new CountUniqueElements();
        int ans = obj.solve(A);
        System.out.println(ans);
    }
}
