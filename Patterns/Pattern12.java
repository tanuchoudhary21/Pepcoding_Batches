package Patterns;
import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int first = 0;
        int second = 1;
        int third = 0;
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(first+"\t");
                third = first+second;
                first = second;
                second = third;
            }
            System.out.println();
        }

    }
}
