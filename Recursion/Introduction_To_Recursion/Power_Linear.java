package Recursion.Introduction_To_Recursion;
import java.util.*;

public class Power_Linear {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int ans = power(num, pow);
        System.out.println(ans);
        sc.close();
    }

    public static int power(int x, int n){
        
        if(n == 0){
            return 1;
        }
        
        int smallAns = power(x, n-1);
        int finalAns = x*smallAns;
        return finalAns;
    }
}
