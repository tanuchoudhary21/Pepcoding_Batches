package Functions_Arrays;
import java.util.*;

public class SumOfTwoArrays {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];
    
    for(int i = 0; i < n1; i++){
        arr1[i] = sc.nextInt();
    }
    
    int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    
    for(int i = 0; i < n2; i++){
        arr2[i] = sc.nextInt();
    }
    
    int n3 = n1 > n2 ? n1 : n2;
    int result[] = new int[n3];
    
    int i = n1-1;
    int j = n2-1;
    int k = n3-1;
    int carry = 0;
    
    while(i >= 0 || j >= 0){
        int sum = carry;
        
        if(i >= 0){
            sum += arr1[i];
        }
        
        if(j >= 0){
            sum += arr2[j];
        }
        
        int lastDigit = sum %10;
        carry = sum/10;
        result[k] = lastDigit;
        
        i--;
        j--;
        k--;
    }
    
    if(carry > 0){
        System.out.println(carry);
    }
    
    for(int val : result){
        System.out.println(val);
    }
 }

}
