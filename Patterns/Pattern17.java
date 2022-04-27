package Patterns;
import java.util.*;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int spaces = num/2;
        int star = 1;
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= spaces; j++){
                if(i == num/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            
            for(int k = 1; k <= star; k++){
                System.out.print("*\t");
            }
            
            System.out.println();
            
            if(i <= num/2){
                star++;
            }else{
                star--;
            }
        }

    }
}
