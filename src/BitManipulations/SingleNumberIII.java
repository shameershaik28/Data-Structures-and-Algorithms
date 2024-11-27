package BitManipulations;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumberIII {
    public int[] solve(int[] A) {
        int N = A.length;
        //Find XOR of all elements
        int xor = 0;
        for(int i = 0; i < N; i++){
            xor ^= A[i];
        }

        //Find the setBit in XOR
        int index=-1;
        for(int i = 0; i < 32; i++){
            if((xor & (1<<i)) !=0){
                index = i;
                break;
            }
        }

        //Split the array based on the index and get the unique element
        int[] ans = new int[2];
        int set =0; int unset=0;
        for(int i = 0; i < N; i++){
            int ele= A[i];
            if((ele&(1<<index))!=0){
                set = set ^ ele;
            }
            else{
                unset = unset ^ ele;
            }
        }

        int[] result = new int[]{set, unset};
        Arrays.sort(result); //Sort the Array
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        SingleNumberIII s = new SingleNumberIII();
        System.out.println("An array of two integers that appear only once : "+Arrays.toString(s.solve(A)));
    }
}
