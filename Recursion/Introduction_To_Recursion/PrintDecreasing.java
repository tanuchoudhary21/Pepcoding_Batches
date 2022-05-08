package Recursion.Introduction_To_Recursion;
import java.util.*;

public class PrintDecreasing {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDecreasing(num);
        sc.close();
    }

    public static void printDecreasing(int n){
        
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        printDecreasing(n-1);
        
    }
}
