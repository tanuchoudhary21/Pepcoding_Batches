package Recursion.Introduction_To_Recursion;
import java.util.*;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = factorial(num);
        System.out.println(ans);
        sc.close();
    }

    public static int factorial(int n){
        
        if(n == 1){
            return 1;
        }
        
        
        int smallAns = factorial(n-1);
        int finalAns = n*smallAns;
        return finalAns;
    }
}
