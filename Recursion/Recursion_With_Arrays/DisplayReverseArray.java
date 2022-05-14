package Recursion.Recursion_With_Arrays;
import java.util.*;

public class DisplayReverseArray {
   public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        displayArrReverse(arr, 0);
        sc.close();
    }

    public static void displayArrReverse(int[] arr, int idx) {
        
        if(idx < 0){
            return;
        }
        
        System.out.println(arr[idx]);
        displayArrReverse(arr, idx-1);
        

    }

}
