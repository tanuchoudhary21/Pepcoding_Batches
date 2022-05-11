package Recursion.Recursion_With_Arrays;
import java.util.*;

public class DisplayArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        displayArr(arr, n-1);
        sc.close();
    }

    public static void displayArr(int[] arr, int idx){
        
        if(idx < 0){
            // System.out.println(arr[idx]);
            return;
        }
        
        
        displayArr(arr, idx-1);
        System.out.println(arr[idx]);
    }
}
