package QuickSortAndComparatorProblems;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionIndex {
    public int partition(int[] arr) {
        int N = arr.length;
        int pivot = arr[N-1];
        int j=0;
        for(int i =0; i<N-1;i++)
        {
            if(arr[i]<pivot)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        int temp = arr[N-1];
        arr[N-1] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        PartitionIndex p = new PartitionIndex();
        System.out.println("partitionIndex is : "+p.partition(arr));
    }
}
