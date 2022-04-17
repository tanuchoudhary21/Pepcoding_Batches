package Patterns;
import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        
        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
