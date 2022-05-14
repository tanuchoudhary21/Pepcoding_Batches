package Recursion.Recursion_With_Arrays;
import java.util.*;

public class MaxOfArray {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int ans = maxOfArray(arr, 0);
        System.out.println(ans);
        sc.close();
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }
        
        
        int max = maxOfArray(arr, idx+1);
        max = Math.max(max, arr[idx]);
        return max;
    }
}
