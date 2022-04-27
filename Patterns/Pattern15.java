package Patterns;
import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int space = num/2;
        int star = 1;
        int originalVal = 1;
        
        
        for(int i = 1; i <= num ; i++){
            int rowWise = originalVal;
            
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            
            for(int k = 1; k <= star; k++){
                System.out.print(rowWise+"\t");
                if(k <= star/2){
                    rowWise++;
                }else{
                    rowWise--;
                }
            }
            
            System.out.println();
            if(i <= num/2){
                space--;
                star += 2;
                originalVal++;
            }else{
                space++;
                star -= 2;
                originalVal--;  
            }
        }

    }
}
