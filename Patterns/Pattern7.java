package Patterns;
import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(i == j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        

    }
}
