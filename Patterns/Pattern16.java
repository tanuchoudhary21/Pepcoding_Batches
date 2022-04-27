package Patterns;
import java.util.*;

public class Pattern16 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt();
    int spaces = 2*num-3;
    int star = 1;
    
    for(int i = 1; i <= num; i++){
        int val = 1;
        for(int j = 1; j <= star; j++){
            System.out.print(val+"\t");
            val++;
        }
        
        for(int k = 1; k <= spaces; k++){
            System.out.print("\t");
        }
        
        if(i == num){
            star--;
            val--;
        }
        
        for(int j = 1; j <= star; j++){
            val--;
            System.out.print(val+"\t");
        }
        
        System.out.println();
        spaces -= 2;
        star++;
    }

 }
}
