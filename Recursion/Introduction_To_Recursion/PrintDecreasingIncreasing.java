package Recursion.Introduction_To_Recursion;
import java.util.*;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pdi(num);
        sc.close();
    }

    public static void pdi(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
        
    }
}
