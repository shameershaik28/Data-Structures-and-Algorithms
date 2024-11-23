package InterviewQuestions;

import java.util.Scanner;

public class MajorityElement {
    public int majorityElement(final int[] A) {
        int majorityIndex=0; // Take the zero index
        int count=1; // as we have taken the zero index in majority index that's the reason the count is 1 now;
        int n = A.length;

        for(int i=1; i<n; i++){
            if(count==0){
                majorityIndex=i;
                count=1;
            }
            if(A[i]==A[majorityIndex]){
                count++;
            }
            else{
                count--;
            }
        }

        //Find the Frequency of the majority element
        int freq=0;
        for(int i=0; i<n; i++){
            if(A[i]==A[majorityIndex]){
                freq++;
            }
        }
        if(freq>n/2){
            return A[majorityIndex];
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        MajorityElement m = new MajorityElement();
        System.out.println("The majority Element is : "+m.majorityElement(A));
    }
}
