package Patterns;
import java.util.*;

public class Pattern18 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt();
    int space = 0;
    int star = num;
    
    for(int i = 1; i <= num; i++){
        for(int j = 1; j<= space; j++){
            System.out.print("\t");
        }
        
        for(int k = 1; k <= star; k++){
            if(i > 1 && i <= num/2 && k > 1 && k < star){
                System.out.print("\t");
            }else{
                System.out.print("*\t");
            }
            
        }
        
        System.out.println();
        if(i <= num/2){
            space++;
            star -= 2;
        }else{
            space--;
            star += 2;
        }
    }

 }
}
