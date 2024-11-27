package BitManipulations;

import java.util.Scanner;

public class UnsetiThBit {
    public int solve(int A, int B) {

      if((A&(1<<B))==0)
      {
          return A;
      }
      else {
          return (A^(1<<B));
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int A = sc.nextInt();
        System.out.println("Enter B :");
        int B = sc.nextInt();
        UnsetiThBit obj = new UnsetiThBit();
        System.out.println(obj.solve(A, B));
    }
}
