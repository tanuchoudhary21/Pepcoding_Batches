package Recursion.Recursion_With_Arrays;
import java.util.*;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int ans = lastIndex(arr, 0, data);
        System.out.println(ans);
        sc.close();
    }

    public static int lastIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length){
            return -1;
        }
        
        
        int li = lastIndex(arr, idx+1, x);
        if(li == -1){
            if(arr[idx] == x){
                li = idx;
            }
        }
        
        return li;
    }
}
