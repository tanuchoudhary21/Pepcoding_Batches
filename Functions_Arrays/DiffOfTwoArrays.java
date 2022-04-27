package Functions_Arrays;
import java.util.*;

public class DiffOfTwoArrays {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];
    
    for(int i = 0; i< n1; i++){
        arr1[i] = sc.nextInt();
    }
    
     int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    
    for(int i = 0; i< n2; i++){
        arr2[i] = sc.nextInt();
    }
    
    int diffrence[] = new int[n2];
    int i = n1-1;
    int j = n2-1;
    int k = n2-1;
    int carry = 0;
    
    while(i >= 0 || j >= 0){
        int num1 = 0;
        
        if(i >= 0){
            num1 = arr1[i];
        }else{
            num1 = 0;
        }
        if(arr2[j] + carry >= num1){
            diffrence[k] = arr2[j]+carry-num1;
            carry = 0;
        }else{
            diffrence[k] = arr2[j]+carry+10-num1;
            carry = -1;
        }
        i--;
        j--;
        k--;
    }
    
    int idx = 0;
    while(idx < n2){
        if(diffrence[idx] != 0){
            break;
        }else{
            idx++;
        }
    }
    
    while(idx < n2){
        System.out.println(diffrence[idx]);
        idx++;
    }
        
 }

}
