package Patterns;
import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int spaces = num/2;
        int star = 1;
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }
            
            System.out.println();
            
            if(i <= num/2){
                spaces--;
                star += 2;
            }else{
                spaces++;
                star -= 2; 
            }
            
        }

    }
}
