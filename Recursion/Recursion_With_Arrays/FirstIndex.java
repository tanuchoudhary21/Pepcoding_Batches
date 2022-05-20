package Recursion.Recursion_With_Arrays;
import java.util.*;

public class FirstIndex {
   public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        
        int ans = firstIndex(arr, 0, data);
        System.out.println(ans);
        sc.close();
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int fi = 0;
        if(arr[idx] == x){
            fi = idx;
        }else{
             fi = firstIndex(arr, idx+1, x);
            
        }
        
        return fi;
    }
}
