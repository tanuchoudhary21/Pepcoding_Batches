package Functions_Arrays;
import java.util.*;

public class BrokenEconomy {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    
    for(int i = 0; i < size; i++){
        arr[i] = sc.nextInt();
    }
    
    int data = sc.nextInt();
    
    int start = 0;
    int end = size-1;
    int ceil = 0;
    int floor = 0;
    
    while(start <= end){
        int mid = start + (end-start)/2;
        if(arr[mid] < data){
            start = mid+1;
            floor = arr[mid];
        }else if(arr[mid] > data){
            end = mid - 1;
            ceil = arr[mid];
        }else{
            floor = arr[mid];
            ceil = arr[mid];
            break;
        }
    }
    
    System.out.println(ceil);
    System.out.println(floor);
 }

}
