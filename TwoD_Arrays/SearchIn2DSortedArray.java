package TwoD_Arrays;
import java.util.*;

public class SearchIn2DSortedArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[][] = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int data = sc.nextInt();
        int i = 0;
        int j = n-1;
        while(i < n && j >= 0){
            if(arr[i][j] == data){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(data < arr[i][j]){
                j--;
            }else if(data > arr[i][j]){
                i++;
            }
        }
        
        System.out.println("Not Found");
    }

}
