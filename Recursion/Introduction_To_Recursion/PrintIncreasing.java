package Recursion.Introduction_To_Recursion;
import java.util.*;

public class PrintIncreasing {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printIncreasing(num);
        sc.close();
    }

    public static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        
        printIncreasing(n-1);
        System.out.println(n);
    }

}
