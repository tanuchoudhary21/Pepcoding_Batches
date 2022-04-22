package Patterns;
import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt();
    
    int outerSpace = num/2;
    int innerSpace = -1;
    
    for(int i = 1; i <= num; i++){
        // Outer space
        for(int k = 1; k <= outerSpace; k++){
            System.out.print("\t");
        }
        
        System.out.print("*\t");
        
        // Inner Space
        for(int k = 1; k <= innerSpace; k++){
            System.out.print("\t");
        }
        
        if(i > 1 && i < num){
            System.out.print("*\t");
        }
        
        if( i<=num/2){
            outerSpace--;
            innerSpace += 2;
        }else{
            outerSpace++;
            innerSpace -= 2;
        }
        System.out.println();
    }

 }
}
