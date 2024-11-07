package Arrays.Subarrays;

import java.util.Scanner;

//Brute-Force Approach used here
public class SubarraySums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < N; i++){
            int sum =0;
            for(int j =i; j < N; j++){
                sum += arr[j];
                System.out.print(sum+" ");
                }

            }
        }
    }
