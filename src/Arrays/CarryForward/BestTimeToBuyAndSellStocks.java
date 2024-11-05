package Arrays.CarryForward;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {
    public int maxProfit(final List<Integer> A) {
        int N = A.size();
        int max_Value=A.get(N-1);
        int max_Profit=0;

        for(int i =N-2;i>=0;i--){
            if(A.get(i)>max_Value){
                max_Value=A.get(i);
            }
            int profit = max_Value-A.get(i);
            max_Profit=Math.max(max_Profit,profit);
        }
        return max_Profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the  array");
        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        BestTimeToBuyAndSellStocks bst = new BestTimeToBuyAndSellStocks();
        int ans = bst.maxProfit(A);
        System.out.println("The Max_Profit is : " + ans);
    }
}
