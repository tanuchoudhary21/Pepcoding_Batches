package Recursion.Introduction_To_Recursion;
import java.util.*;

public class PrintZigZag {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pzz(num);
        sc.close();
    }

    public static void pzz(int n){
        if(n == 0){
            return;
        }
        
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        
    }
}
