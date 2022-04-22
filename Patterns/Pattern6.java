package Patterns;
import java.util.*;

public class Pattern6 {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        
        int star = num/2+1;
        int space = 1;
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }
            
            for(int k = 1; k <= space; k++){
                System.out.print("\t");
            }
            
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }
            
            if(i <= num/2){
                star--;
                space += 2;
            }else{
                star++;
                space -= 2;
            }
            
            System.out.println();
        }

    }
}
