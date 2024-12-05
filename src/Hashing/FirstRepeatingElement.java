package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingElement {
    public int solve(int[] A) {
        int N = A.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if(map.containsKey(A[i])) {
                int val = map.get(A[i]);
                map.put(A[i], val + 1);
            }
            else {
                map.put(A[i], 1);
            }
        }

        //Traverse the array and find the element that occurs more than once
        for(int i = 0; i < N; i++) {
            if(map.get(A[i])> 1) {
                return A[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        FirstRepeatingElement f = new FirstRepeatingElement();
        int ans = f.solve(arr);
        System.out.println(ans);
    }
}
