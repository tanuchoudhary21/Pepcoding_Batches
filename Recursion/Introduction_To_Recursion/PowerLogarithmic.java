package Recursion.Introduction_To_Recursion;
import java.util.*;

public class PowerLogarithmic {
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
        
        int smallAns = power(x, n/2);
        int ans = smallAns*smallAns;
        
        if(n % 2 != 0){
            ans = ans*x;
        }
        
        return ans;
        
    }
}
